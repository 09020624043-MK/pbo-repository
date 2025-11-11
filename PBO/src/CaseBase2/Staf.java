/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CaseBase2;

/**
 *
 * @author nas27
 */
public class Staf extends Pegawai {
    private int jumlahHadir;

    public Staf(String nama, String nip, String email, String pangkat, int jumlahHadir) {
        super(nama, nip, email, pangkat);
        this.jumlahHadir = jumlahHadir;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + (jumlahHadir * 100000);
    }
}
