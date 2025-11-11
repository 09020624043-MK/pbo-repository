/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CaseBase2;

/**
 *
 * @author nas27
 */
public class Main {
    public static void main(String[] args) {
        // Membuat array pegawai
        Pegawai[] daftarPegawai = new Pegawai[4];
        
        daftarPegawai[0] = new Dosen("Ahmad", "198765", "ahmad@uinsby.ac.id", "III", 18);
        daftarPegawai[1] = new Dosen("Budi", "198111", "budi@uinsby.ac.id", "IV", 22);
        daftarPegawai[2] = new Staf("Citra", "200123", "citra@uinsby.ac.id", "II", 15);
        daftarPegawai[3] = new Staf("Dewi", "200456", "dewi@uinsby.ac.id", "I", 20);

        System.out.println("=== Rekap Gaji Pegawai UINSA ===");
        for (Pegawai p : daftarPegawai) {
            p.tampilkanData();
        }
    }
}