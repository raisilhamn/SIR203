/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasmingguke3;

import jdk.nashorn.internal.codegen.CompilerConstants;

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

    public boolean tambahMuatan(double muatanx) {
        double a = this.muatan;
        a += muatanx;
        if (a < this.muatanMaks) {
            this.muatan += muatanx;
            return true;
        } else {
//            System.out.println("tidak bisa menambah beban " + muatanx + " kapasitas penuh");
            return false;
        }
    }

    public double newtsToKilo(double berat) {
        double a;
        a = this.muatan;
        a *= 9.8;
        return a;
    }

    public double kiloToNewts(double berat) {
        double a;
        a = this.muatan;
        if (a == 0) {
            a /= 9.8;
            return a;
        } else {
            System.out.println("tidak boleh 0");
            return 0;
        }

    }

}
