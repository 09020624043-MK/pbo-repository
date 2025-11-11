/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorfysm;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mahasiswa {
    String nama;
    String nim;
    List<Matakuliah> mataKuliahList = new ArrayList<>();
    
    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }
    public void tambahMatakuliah(Matakuliah mk) {
        mataKuliahList.add(mk);
    }
    public double hitungIP() {
        double totalBobot = 0.0;
        int totalSKS = 0;
        for (Matakuliah mk : mataKuliahList) {
            double nilaiAkhir = mk.hitungNilai();
            double indeks = getIndeks(nilaiAkhir);
            totalBobot += indeks * mk.sks;
            totalSKS += mk.sks;
        }
        if (totalSKS == 0) return 0.0;
        return totalBobot / totalSKS;
}
// Fungsi konversi nilai ke huruf dan indeks sesuai aturan UINSA (disesuaikan dengan contoh)
    public static String getHuruf(double nilai) {
        if (nilai >= 80) return "A";
        else if (nilai >= 70) return "B";
        else if (nilai >= 60) return "C";
        else if (nilai >= 50) return "D";
        else return "E";
    }
    
    public static double getIndeks(double nilai) {
        if (nilai >= 90) return 4.0;
        else if (nilai >= 85) return 3.75;  // Contoh: 87.6 -> 3.75
        else if (nilai >= 80) return 3.5;   // Contoh: 84 -> 3.5
        else if (nilai >= 75) return 3.0;
        else if (nilai >= 70) return 2.75;
        else if (nilai >= 65) return 2.5;
        else if (nilai >= 60) return 2.0;
        else if (nilai >= 55) return 1.5;
        else if (nilai >= 50) return 1.0;
        else return 0.0;
    }
}