/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CaseBase2;

/**
 *
 * @author nas27
 */
public class Dosen extends Pegawai {
    private int jumlahSKS;

    public Dosen(String nama, String nip, String email, String pangkat, int jumlahSKS) {
        super(nama, nip, email, pangkat);
        this.jumlahSKS = Math.min(jumlahSKS, 20); // maksimal 20 SKS
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + (jumlahSKS * 250000);
    }
}
