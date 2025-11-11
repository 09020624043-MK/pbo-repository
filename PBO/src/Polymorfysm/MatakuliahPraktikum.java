/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorfysm;
import java.util.List;
import java.util.ArrayList;

class MatakuliahPraktikum extends Matakuliah {
    List<Double> moduls = new ArrayList<>();
    
    public MatakuliahPraktikum(List<Double> moduls) {
        this.moduls = moduls;
    }
    
    @Override
    public double hitungNilai() {
        if (moduls.isEmpty()) return 0.0;
        double sum = 0.0;
        for (double nilai : moduls) {
            sum += nilai;
        }
        return sum / moduls.size();
    }
}
