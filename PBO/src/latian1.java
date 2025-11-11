/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nas27
 */
public class latian1{
   // public static void main (String []args){//
    
    public static void main(String[] args) {
        Mhs ml = new Mhs();
        ml.nama = "Ahmad Yusuf";
        ml.nim = "09020624042";
        ml.email ="muadzmufti28@gmail.com";
        ml.tahunmasuk = 2024;
        
        ml.ubahEmail("rangga@gmail.com");
        
        System.out.println(ml.email);
        // misalnya sekarang tahun 2025
        int tahunSekarang = 2030;
        System.out.println("Mahasiswa Tahun Ke " + ml.Angkatan(tahunSekarang));
}}