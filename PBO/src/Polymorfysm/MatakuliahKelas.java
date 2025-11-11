/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorfysm;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatakuliahKelas extends Matakuliah {
    double performance;
    double uts;
    double tugas;
    double uas;
    
    public MatakuliahKelas(double perf, double uts, double tugas, double uas) {
        this.performance = perf;
        this.uts = uts;
        this.tugas = tugas;
        this.uas = uas;
    }
    
    @Override
    public double hitungNilai() {
        return 0.1 * performance + 0.2 * uts + 0.3 * tugas + 0.4 * uas;
    } 
    
}
