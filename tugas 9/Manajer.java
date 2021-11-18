package mingguke9;

public class Manajer extends Pegawai {

    private int tunjangan;

    public Manajer(String nama, int gaji, int tunjangan) {
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }

    @Override
    public int infoGaji() {
        return super.infoGaji(); //To change body of generated methods, choose Tools | Templates.
    }

    public int infoTunjangan() {
        return tunjangan;
    }

}
