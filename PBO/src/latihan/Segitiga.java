/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author USER
 */
public class Segitiga extends bangunDatar {
    public double alas, tinggi, sisiMiring;

    public Segitiga(double alas, double tinggi, double sisiMiring) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }

   
    public double luas() {
        return 0.5 * alas * tinggi;
    }

    public double keliling() {
        return alas + tinggi + sisiMiring;
    }
}

