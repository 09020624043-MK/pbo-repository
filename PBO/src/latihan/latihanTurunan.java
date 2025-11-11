/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan;

/**
 *
 * @author nas27
 */
public class latihanTurunan {
    
    public static void main(String[] args) {
//    PersegiPanjang x = new PersegiPanjang(10,5);
//    System.out.println("jumSisi: "+ x.jumlahsisi);
//    System.out.println("luas: "+x.luas());
//    System.out.println("keliling: "+x.keliling());
      
      bangunDatar[] list = new bangunDatar[5];
      list [0] = new PersegiPanjang(3,5);
      list [1] = new Lingkaran (3);
      list [2] = new Segitiga(2,1,2);
      list [3] = new PersegiPanjang(3,5);
      list [4] = new Lingkaran (3);
//      list [5] = new Segitiga(2,1,2);
        for (int i = 0; i < list.length; i++) {
            System.out.println(
                    "Objek ke-" + (i+1) + " luas = " + list[i].luas() + ", keliling = " + list[i].keliling());
        }

   
    }
   
}
