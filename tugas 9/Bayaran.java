package mingguke9;

public class Bayaran {

    public int hitungBayaran(Pegawai peg) {
        int uang = peg.infoGaji();
        if (peg instanceof Manajer) {
            uang += ((Manajer) peg).infoTunjangan();
        } else if (peg instanceof Programmer) {
            uang += ((Programmer) peg).infoBonus();
        }
        return uang;
    }

    public static void main(String[] args) {
        Manajer man = new Manajer("Agus", 800, 50);
        Programmer prog = new Programmer("Budi", 600, 30);
        Bayaran hr = new Bayaran();
        System.out.println("Bayaran untuk manajer : "
                + hr.hitungBayaran(man));
        System.out.println("Bayaran untuk programmer : "
                + hr.hitungBayaran(prog));

    }

}
