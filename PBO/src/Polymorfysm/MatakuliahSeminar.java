/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorfysm;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class MatakuliahSeminar extends Matakuliah {
     double pembimbingan;
    double artikel;
    double presentasi;
    
    public MatakuliahSeminar(double pemb, double art, double pres) {
        this.pembimbingan = pemb;
        this.artikel = art;
        this.presentasi = pres;
    }
    
    @Override
    public double hitungNilai() {
        return 0.2 * pembimbingan + 0.5 * artikel + 0.3 * presentasi;
    }
}
