package latihan2;

import java.util.Scanner;

/**
 *
 * @author Rais
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("============ Pertambahan ============");
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan pembilang pecahan 1: ");
        int pembilang = input.nextInt();
        System.out.print("masukkan penyebut pecahan 1: ");
        int penyebut = input.nextInt();
        while (penyebut == 0) {
            System.out.println("Masukan nilai selain 0");
            System.out.print("masukkan penyebut pecahan 1: ");
            penyebut = input.nextInt();
        }
        Pecahan p1 = new Pecahan();
        p1.setPembilang(pembilang);
        p1.setPenyebut(penyebut);
        System.out.println("Bentuk pecahan : " + p1.getPembilang() + "/" + p1.getPenyebut());

        System.out.print("masukkan pembilang pecahan 2: ");
        int pembilang2 = input.nextInt();
        System.out.print("masukkan penyebut pecahan 2: ");
        int penyebut2 = input.nextInt();
        while (penyebut2 == 0) {
            System.out.println("Masukan nilai selain 0");
            System.out.print("masukkan penyebut pecahan 2: ");
            penyebut2 = input.nextInt();
        }

        Pecahan p2 = new Pecahan();
        p2.setPembilang(pembilang2);
        p2.setPenyebut(penyebut2);
        System.out.println("Bentuk pecahan : " + p2.getPembilang() + "/" + p2.getPenyebut());

        System.out.print(p1.getPembilang() + "/" + p1.getPenyebut());
        System.out.print(" + ");
        System.out.print(p2.getPembilang() + "/" + p2.getPenyebut());
        System.out.print(" = ");

        Pecahan hasil;
        hasil = Pecahan.tambah(p1, p2);
        System.out.println(hasil.getPembilang() + "/" + hasil.getPenyebut());

        System.out.println("============ Perkalian ============");

        System.out.print("masukkan pembilang pecahan 1: ");
        int pembilang3 = input.nextInt();
        System.out.print("masukkan penyebut pecahan 1: ");
        int penyebut3 = input.nextInt();
        while (penyebut3 == 0) {
            System.out.println("Masukan nilai selain 0");
            System.out.print("masukkan penyebut pecahan 1: ");
            penyebut3 = input.nextInt();
        }

        Pecahan p3 = new Pecahan();
        p3.setPembilang(pembilang3);
        p3.setPenyebut(penyebut3);
        System.out.println("Bentuk pecahan : " + p3.getPembilang() + "/" + p3.getPenyebut());

        System.out.print("masukkan pembilang pecahan 2: ");
        int pembilang4 = input.nextInt();
        System.out.print("masukkan penyebut pecahan 2: ");
        int penyebut4 = input.nextInt();
        while (penyebut4 == 0) {
            System.out.println("Masukan nilai selain 0");
            System.out.print("masukkan penyebut pecahan 2: ");
            penyebut4 = input.nextInt();
        }
        Pecahan p4 = new Pecahan();
        p4.setPembilang(pembilang4);
        p4.setPenyebut(penyebut4);
        System.out.print(p3.getPembilang() + "/" + p3.getPenyebut());
        System.out.print(" * ");
        System.out.print(p4.getPembilang() + "/" + p4.getPenyebut());
        System.out.print(" = ");

        Pecahan hasil2;
        hasil2 = Pecahan.kali(p3, p4);
        System.out.println(hasil2.getPembilang() + "/" + hasil2.getPenyebut());

    }

}
