/**
 *
 * @author nas27
 */
import java.util.Scanner;
public class ClassMain {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ================
        // Registrasi
        // ================
        System.out.println(" REGISTRASI ");
        System.out.print("Nama       : ");
        String nama = input.nextLine();

        // validasi email harus @gmail.com Menggunakan !
        String email;
        do {
            System.out.print("Email      : ");
            email = input.nextLine();
            if (!email.endsWith("@gmail.com")) {
                System.out.println("Email harus diakhiri dengan @gmail.com");
            }
        } while (!email.endsWith("@gmail.com"));

        System.out.print("Username   : ");
        String username = input.nextLine();

        // validasi password harus angka minimal 8 digit Menggunakamn !
        String password;
        do {
            System.out.print("Password   : ");
            password = input.nextLine();
            if (!password.matches("\\d{8,}")) {
                System.out.println("❌ Password harus berupa angka minimal 8 digit");
            }
        } while (!password.matches("\\d{8,}"));

        // buat objek user
        User user = new User(nama, email, username, password);
        System.out.println("\n✅ Registrasi berhasil, silakan login!\n");

        // ================
        // Login
        // ================
        boolean loginBerhasil = false;
        while (!loginBerhasil) {
            System.out.println(" LOGIN ");
            System.out.print("Username : ");
            String u = input.nextLine();
            System.out.print("Password : ");
            String p = input.nextLine();

            if (u.equals(user.getUsername()) && p.equals(user.getPassword())) {
                System.out.println("\n✅ Login berhasil!");
                System.out.println("Nama     : " + user.getNama());
                System.out.println("Email    : " + user.getEmail());
                System.out.println("Username : " + user.getUsername());
                loginBerhasil = true;
            } else {
                System.out.println(" Username atau password salah. Coba lagi.\n");
            }
        }

        input.close();
    }
}
