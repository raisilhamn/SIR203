package latihan2;

/**
 *
 * @author Rais
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Pecahan p1 = new Pecahan();
        p1.setPembilang(1);
        p1.setPenyebut(2);
        Pecahan p2 = new Pecahan();
        p2.setPembilang(1);
        p2.setPenyebut(2);

        System.out.print(p1.getPembilang() + "/" + p1.getPenyebut());
        System.out.print(" + ");
        System.out.print(p2.getPembilang() + "/" + p2.getPenyebut());
        System.out.print(" = ");

        Pecahan hasil;
        hasil = Pecahan.tambah(p1, p2);
        System.out.println(hasil.getPembilang() + "/" + hasil.getPenyebut());

        Pecahan p3 = new Pecahan();
        p3.setPembilang(90);
        p3.setPenyebut(95);
        Pecahan p4 = new Pecahan();
        p4.setPembilang(5);
        p4.setPenyebut(10);
        System.out.print(p3.getPembilang() + "/" + p3.getPenyebut());
        System.out.print(" * ");
        System.out.print(p4.getPembilang() + "/" + p4.getPenyebut());
        System.out.print(" = ");

        Pecahan hasil2;
        hasil2 = Pecahan.kali(p3, p4);
        System.out.println(hasil2.getPembilang() + "/" + hasil2.getPenyebut());

    }

}
