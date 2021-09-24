/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasmingguke3;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // tugas 1
        boolean status;
        Tabungan tabunganTgs = new Tabungan(5000);
        System.out.println("Saldo awal : " + tabunganTgs.getSaldo());
        tabunganTgs.simpanUang(3000);
        System.out.println("Jumlah uang yang disimpan : 3000");
        status = tabunganTgs.ambilUang(6000);
        System.out.print("Jumlah uang yang diambil : 6000");
        if (status) {
            System.out.println("      OK");
        } else {
            System.out.println("     Gagal");
        }
        tabunganTgs.simpanUang(3500);
        System.out.println("Menyimpan saldo : 3500");
        status = tabunganTgs.ambilUang(4000);
        System.out.print("Jumlah uang yang diambil : 4000");
        if (status) {
            System.out.println("      OK");
        } else {
            System.out.println("     Gagal");
        }
        status = tabunganTgs.ambilUang(1600);
        System.out.print("Jumlah uang yang diambil : 1600");
        if (status) {
            System.out.println("      OK");
        } else {
            System.out.println("     Gagal");
        }
        tabunganTgs.simpanUang(2000);
        System.out.println("Jumlah uang yang disimpan : 2000");
        System.out.println("Saldo sekarang : " + tabunganTgs.getSaldo());

        // tugas 2
        Truk truk = new Truk(900);
        boolean status2 = true;
        System.out.println("Muatan Maksimum : " + truk.getMuatanMaks());
        status = truk.tambahMuatan(500.0);
        System.out.print("tambah muatan : 500");
        if (status2) {
            System.out.println("    OK");
        } else {
            System.out.println("    Gagal");
        }
        status2 = truk.tambahMuatan(300.0);
        System.out.print("tambah muatan : 300 ");
        if (status2) {
            System.out.println("    OK");
        } else {
            System.out.println("    Gagal");
        }
        status2 = truk.tambahMuatan(150.0);
        System.out.print("tambah muatan : 150 ");
        if (status2) {
            System.out.println("    OK");
        } else {
            System.out.println("    Gagal");
        }
        status2 = truk.tambahMuatan(50.0);
        System.out.print("tambah muatan : 50 ");
        if (status2) {
            System.out.println("    OK");
        } else {
            System.out.println("    Gagal");
        }
        
        System.out.println("muatan sekarang : " + truk.getMuatan());
    }

}
