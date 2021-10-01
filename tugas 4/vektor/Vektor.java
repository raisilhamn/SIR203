
import java.util.ArrayList;
import java.util.Scanner;

public class Vektor {
    private ArrayList<Integer> vektor;
    private ArrayList<Double> vektorBagi;
    private Scanner input = new Scanner(System.in);

    public Vektor() {
        vektor = new ArrayList<>();
        vektorBagi = new ArrayList<>();
    }

    public int getSize() {
        return this.vektor.size();
    }

    public int getValue(int n) {
        return this.vektor.get(n);
    }

    public void setValue(int n, int value) {
        this.vektor.set(n, value);
    }

    public void setVektor() {
        System.out.print("Masukkan berapa panjang vektor : ");
        int jumlah;
        jumlah = input.nextInt();
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan elemen ke " + i + " : ");
            int elemen = input.nextInt();
            this.vektor.add(elemen);
        }
    }

    public static Vektor penjumlahanVektor(Vektor v1, Vektor v2) {
        Vektor temp = new Vektor();
        if (v1.getSize() != v2.getSize()) {
            System.out.println("Tidak bisa mengoperasikan vektor, Dimensi tidak sama");
        } else {
            for (int i = 0; i < v1.getSize(); i++) {
                temp.vektor.add(v1.getValue(i) + v2.getValue(i));
            }
        }
        return temp;
    }

    public static Vektor penguranganVektor(Vektor v1, Vektor v2) {
        Vektor temp = new Vektor();
        if (v1.getSize() != v2.getSize()) {
            System.out.println("Tidak bisa mengoperasikan vektor, Dimensi tidak sama");
        } else {
            for (int i = 0; i < v1.getSize(); i++) {
                temp.vektor.add(v1.getValue(i) - v2.getValue(i));
            }
        }
        return temp;
    }

    public static Vektor perkalianSkalar(Vektor v, int skalar) {
        Vektor temp = new Vektor();
        for (int i = 0; i < v.getSize(); i++) {
            temp.vektor.add(v.getValue(i) * skalar);
        }
        return temp;
    }

    public static Vektor pembagianSkalar(Vektor v, int skalar) {
        Vektor temp = new Vektor();
        for (int i = 0; i < v.getSize(); i++) {
            temp.vektorBagi.add(Double.valueOf(v.getValue(i)) / skalar);
        }
        return temp;
    }

    public static int perkalianDot(Vektor v1, Vektor v2) {
        int temp = 0;
        if (v1.getSize() != v2.getSize()) {
            System.out.println("Tidak bisa mengoperasikan vektor, Dimensi tidak sama");
        } else {
            for (int i = 0; i < v1.getSize(); i++) {
                temp += v1.getValue(i) * v2.getValue(i);
            }
        }
        return temp;
    }

    public void print() {
        System.out.print("{ ");
        for (int i = 0; i < this.vektor.size(); i++) {
            System.out.print(this.vektor.get(i) + " ");
        }
        System.out.print("}");
        System.out.println();
    }

    public void printBagi() {
        System.out.print("{ ");
        for (int i = 0; i < this.vektorBagi.size(); i++) {
            System.out.print(this.vektorBagi.get(i) + " ");
        }
        System.out.print("}");
        System.out.println();
    }

}
