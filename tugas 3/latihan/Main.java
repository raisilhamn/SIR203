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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // latihan 1
        Tabungan tabungan = new Tabungan(5000);
        System.out.println("Saldo awal : " + tabungan.saldo);
        tabungan.ambilUang(2300);
        System.out.println("Jumlah saldo terambil : 2300");
        System.out.println("saldo sekarang : " + tabungan.saldo);
        
        // latihan 2
        Mahasiswa mahasiswa = new Mahasiswa(90, "Rais Ilham Nustara");
        System.out.println("NRP : " + mahasiswa.getNrp());
        System.out.println("Nama : " + mahasiswa.getNama());

        // latihan 3 
        Truk truk = new Truk(1000.0);
        System.out.println(truk.getMuatanMaks());
        System.out.println("Tambah muatan : 500");
        truk.tambahMuatan(500.0);
        System.out.println("Tambah muatan : 350");
        truk.tambahMuatan(350.0);
        System.out.println("Tambah muatan : 100");        
        truk.tambahMuatan(100.0);
        System.out.println("Tambah muatan : 150");
        truk.tambahMuatan(150.0);
        System.out.println("Kapasitas saat ini "+truk.getMuatan());

        
    }

}
