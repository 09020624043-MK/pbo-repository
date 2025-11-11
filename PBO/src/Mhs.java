/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nas27
 */
public class Mhs {
  String nim, nama, email ;
      int tahunmasuk;
      
      void ubahEmail(String emailBaru) {
          email = emailBaru;
      }
     int Angkatan(int tahunSekarang) {
        return tahunSekarang - tahunmasuk; 
        // +1 kalau kamu mau tahun masuk dianggap angkatan pertama
    }
   }

