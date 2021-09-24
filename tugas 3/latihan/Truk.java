/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmingguke3;
/**
 *
 * @author LENOVO
 */
public class Truk {

    private double muatan = 0.;
    private double muatanMaks;

    public Truk(double muatanMaks) {
        this.muatanMaks = muatanMaks;
    }

    public double getMuatan() {
        return this.muatan;
    }

    public double getMuatanMaks() {
        return this.muatanMaks;
    }

    public double tambahMuatan(double muatanx) {
        double a = this.muatan;
        a += muatanx;
        if (a < this.muatanMaks) {
            return this.muatan += muatanx;
        } else {
            System.out.println("tidak bisa menambah beban " + muatanx + " kapasitas penuh");
            return this.muatan;
        }
    }
    
}
