/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author USER
 */
public class Lingkaran extends bangunDatar{
    public double jarijari;
    
    public Lingkaran (int jarijari) {
        this.jarijari = jarijari;
    }
    
    public double luas () {
        return Math.PI * jarijari * jarijari;
        
    }
    
    public double keliling () {
        return 2 * Math.PI * jarijari;
    }
    
}
