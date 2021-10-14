package mingguke5praktikum.perbankan;


public class PengambilanUang extends Tabungan{
    protected int proteksi;
    public PengambilanUang(int saldo){
        super.saldo= saldo;
    }
    public PengambilanUang(int saldo, int proteksi){
        super.saldo = saldo;
        this.proteksi = proteksi;
    }
    
    public int getSaldo(){
        return super.saldo;
    }
    
    public boolean ambilUang(int jumlah){
        boolean result = false;
        if(super.saldo-jumlah >= proteksi){
            result = true;
            super.saldo -= jumlah;
        }
        return result;
    }
}
