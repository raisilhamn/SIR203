/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mingguke5praktikum;

import mingguke5praktikum.perbankan.*;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PengambilanUang tabungan = new PengambilanUang(5000, 1000);
        System.out.println("Jang yang ditabung : 5000");
        System.out.println("Uang yang diproteksi : 1000");
        System.out.println("--------");
        System.out.println("Uang yang akan diambil : 4500 " + tabungan.ambilUang(4500));
        System.out.println("Saldo sekarang : " + tabungan.getSaldo());
        System.out.println("--------");
        System.out.println("Jang yang akan diambil : 2500 " + tabungan.ambilUang(2500));
        System.out.println("Saldo sekarang : " + tabungan.getSaldo());
    }

}
