/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorfysm;

abstract class Matakuliah {
    String nama;
    String jadwal;
    String dosen;
    int sks;
    
    public abstract double hitungNilai();
    
    // Getter untuk nama, dll., jika diperlukan
    public String getNama() { return nama; }
    public int getSKS() { return sks; }
    public double getNilaiAkhir() { return hitungNilai(); }
}
