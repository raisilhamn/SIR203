import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Vektor v1 = new Vektor();
        v1.setVektor();
        v1.print();

        Vektor v2 = new Vektor();
        v2.setVektor();
        v2.print();

        Vektor hasilPenjumlahan = new Vektor();
        hasilPenjumlahan = Vektor.penjumlahanVektor(v1, v2);
        System.out.print("Hasil penjumlahan vektor : ");
        hasilPenjumlahan.print();

        Vektor hasilPengurangan = new Vektor();
        hasilPengurangan = Vektor.penguranganVektor(v1, v2);
        System.out.print("Hasil pengurangan vektor : ");
        hasilPengurangan.print();

        Vektor hasilPerkalian = new Vektor();
        int pengkali;
        System.out.print("Masukan pengkali skalar ");
        pengkali = input.nextInt();
        hasilPerkalian = Vektor.perkalianSkalar(v1, pengkali);
        System.out.print("Hasil perkalian skalar vektor : ");
        hasilPerkalian.print();

        int pembagi;
        System.out.print("Masukan pembagi skalar ");
        pembagi = input.nextInt();
        Vektor hasilPembagian = new Vektor();
        hasilPembagian = Vektor.pembagianSkalar(v1, pembagi);
        System.out.print("Hasil pembagian vektor : ");
        hasilPembagian.printBagi();

        int dot = Vektor.perkalianDot(v1, v2);
        System.out.print("Hasil perkalian dot vektor : " + dot);

        input.close();
    }
}
