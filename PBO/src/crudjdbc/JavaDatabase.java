package crudjdbc;

import java.sql.*;
import java.util.*;

public class JavaDatabase {

    private static final String URL = "jdbc:postgresql://localhost:3300/javaDatabase";
    private static final String USER = "postgres";
    private static final String PASSWORD = "1234";

    public static void main(String[] args) {
        try {
            // 1. Buat koneksi ke database
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Koneksi Berhasil!");

            mahasiswa m = new mahasiswa("5", "Mufti1", 2025);
            String sql = "INSERT INTO mahasiswa (id, nim, nama, tahunmasuk) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, 5); // id
            ps.setString(2, m.nim);
            ps.setString(3, m.nama);
            ps.setInt(4, m.tahunmasuk);
            ps.executeUpdate();

            con.close();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    // READ
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static List<mahasiswa> getAll() {
        List<mahasiswa> list = new ArrayList<>();
        String sql = "SELECT * FROM Mahasiswa";
        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                mahasiswa m = new mahasiswa(
                        rs.getString("nim"),
                        rs.getString("nama"),
                        rs.getInt("tahunmasuk")
                );
                list.add(m);
            }
        } catch (SQLException e) {
            System.out.println("Error read: " + e.getMessage());
        }
        return list;
    }

    // UPDATE
    public static void update(mahasiswa m) {
        String sql = "UPDATE Mahasiswa SET nama = ?, tahunmasuk = ? WHERE nim = ?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, m.nama);
            stmt.setInt(2, m.tahunmasuk);
            stmt.setString(3, m.nim);
            stmt.executeUpdate();
            System.out.println("Data berhasil diperbarui.");
        } catch (SQLException e) {
            System.out.println("Error update: " + e.getMessage());
        }
    }

    // DELETE
    public static void delete(String nim) {
        String sql = "DELETE FROM Mahasiswa WHERE nim = ?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nim);
            stmt.executeUpdate();
            System.out.println("Data berhasil dihapus.");
        } catch (SQLException e) {
            System.out.println("Error delete: " + e.getMessage());
        }
    }
}
