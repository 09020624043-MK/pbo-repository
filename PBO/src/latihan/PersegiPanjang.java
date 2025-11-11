/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author USER
 */
public  class PersegiPanjang extends bangunDatar{
    public double panjang;
    public double lebar;
    
    public PersegiPanjang (double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        
    }
    
    public double luas (){
        return panjang * lebar;    
    }
    
    public double keliling(){
        return 2 * (panjang + lebar);
    }
            
    
    
}
