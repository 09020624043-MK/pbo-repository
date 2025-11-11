/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CaseBase2;

/**
 *
 * @author nas27
 */
public class Pegawai {
    protected String nama;
    protected String nip;
    protected String email;
    protected String pangkat;
    protected double gajiPokok = 2000000;

    public Pegawai(String nama, String nip, String email, String pangkat) {
        this.nama = nama;
        this.nip = nip;
        this.email = email;
        this.pangkat = pangkat;
    }

    public double hitungGaji() {
        return gajiPokok;
    }

    public void tampilkanData() {
        System.out.println("Nama   : " + nama);
        System.out.println("NIP    : " + nip);
        System.out.println("Email  : " + email);
        System.out.println("Pangkat: " + pangkat);
        System.out.println("Total Gaji: Rp " + hitungGaji());
        System.out.println("--------------------------------");
    }
}