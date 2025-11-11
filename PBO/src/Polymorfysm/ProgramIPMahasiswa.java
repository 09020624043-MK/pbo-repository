/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorfysm;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramIPMahasiswa {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input profile mahasiswa
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        
        Mahasiswa mahasiswa = new Mahasiswa(nama, nim);
        
        // Jumlah mata kuliah
        System.out.print("Jumlah mata kuliah yang diambil: ");
        int jumlahMK = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        for (int i = 0; i < jumlahMK; i++) {
            System.out.println("Mata kuliah " + (i + 1) + ":");
            System.out.print("Jenis MK (1. Kelas, 2. Praktikum, 3. Seminar): ");
            int jenis = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            
            System.out.print("Nama MK: ");
            String namaMK = scanner.nextLine();
            System.out.print("SKS: ");
            int sks = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            System.out.print("Jadwal: ");
            String jadwal = scanner.nextLine();
            System.out.print("Dosen: ");
            String dosen = scanner.nextLine();
            
            Matakuliah mk = null;
            double nilaiAkhir = 0.0;
            
             if (jenis == 1) { // Kelas
                System.out.print("Nilai performance: ");
                double perf = scanner.nextDouble();
                System.out.print("Nilai UTS: ");
                double uts = scanner.nextDouble();
                System.out.print("Nilai tugas: ");
                double tugas = scanner.nextDouble();
                System.out.print("Nilai UAS: ");
                double uas = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                
               mk = new MatakuliahKelas (perf, uts, tugas, uas);
               nilaiAkhir = mk.hitungNilai();
                
            } else if (jenis == 2) { // Praktikum
                System.out.print("Masukkan jumlah modul praktikum: ");
                int jmlModul = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                List<Double> moduls = new ArrayList<>();
                for (int j = 0; j < jmlModul; j++) {
                    System.out.print("Nilai modul " + (j + 1) + ": ");
                    double modul = scanner.nextDouble();
                    moduls.add(modul);
                }   
                 scanner.nextLine(); // Consume newline
                
                mk = new MatakuliahPraktikum(moduls);
                nilaiAkhir = mk.hitungNilai();
                
                } else if (jenis == 3) { // Seminar
                System.out.print("Nilai pembimbingan: ");
                double pemb = scanner.nextDouble();
                System.out.print("Nilai artikel: ");
                double art = scanner.nextDouble();
                System.out.print("Nilai presentasi: ");
                double pres = scanner.nextDouble();
                scanner.nextLine(); // Consume newline
                        
                mk = new MatakuliahSeminar(pemb, art, pres);
                nilaiAkhir = mk.hitungNilai();
            }
            
             if (mk != null) {
                mk.nama = namaMK;
                mk.jadwal = jadwal;
                mk.dosen = dosen;
                mk.sks = sks;
                mahasiswa.tambahMatakuliah(mk);
            }
        }
              // Output
        System.out.println("\nRekap IP " + nama + " / " + nim);
        double totalBobot = 0.0;
        int totalSKS = 0;
        
        for (int i = 0; i < mahasiswa.mataKuliahList.size(); i++) {
            Matakuliah mk = mahasiswa.mataKuliahList.get(i);
            double nilai = mk.hitungNilai();
            String huruf = Mahasiswa.getHuruf(nilai);
            double indeks = Mahasiswa.getIndeks(nilai);
            
            System.out.println((i + 1) + ". " + mk.nama);
            System.out.printf("Nilai Akhir: %.1f\n", nilai);  // Sesuai contoh, 87.6 atau 84
            System.out.println("SKS: " + mk.sks);
            System.out.println("Nilai abjad: " + huruf);
            System.out.printf("Nilai Konversi: %.2f\n", indeks);
            
            totalBobot += indeks * mk.sks;
            totalSKS += mk.sks;
        }
        
        double ip = 0.0;
        if (totalSKS > 0) {
            ip = totalBobot / totalSKS;
        }
        System.out.printf("IP Semester: %.2f\n", ip);
        
        scanner.close();
    }
}
       

