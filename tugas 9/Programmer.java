package mingguke9;

public class Programmer extends Pegawai {

    private int bonus;

    public Programmer(String nama, int gaji, int bonus) {
        super(nama, gaji);
        this.bonus = bonus;
    }

    @Override
    public int infoGaji() {
        return super.infoGaji(); //To change body of generated methods, choose Tools | Templates.
    }

    public int infoBonus() {
        return bonus;
    }

}
