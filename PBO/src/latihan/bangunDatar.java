/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author USER
 */
public class bangunDatar {
   public int jumlahsudut;
   public int jumlahsisi = 4;
   public double [] sisi;
    
    public bangunDatar(){
        
    }
    
    public bangunDatar(int jumlahsisi) {
        this.jumlahsisi = jumlahsisi;
        this.sisi = new double [jumlahsisi];
    }
    
    
    
    public double luas () {
        return 0;
    }
    
    public double keliling (){
           int total = 0;
        if (sisi != null) {
            for (int i = 0; i < sisi.length; i++) {
                total += sisi[i];
            }
        }
        return total;
    }
    
}
