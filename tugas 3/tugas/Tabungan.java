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
public class Tabungan {
    public int saldo;
    
    
    public Tabungan(int saldo){
        this.saldo = saldo;
    }

    // tugas 1
    public boolean ambilUang(int jumlah){
        if (this.saldo > jumlah) {
            this.saldo -= jumlah;  
            return true;
        }else{
            return false;
        }
    }
    public void simpanUang(int jumlah){
        this.saldo += jumlah;
    }

    public int getSaldo() {
        return saldo;
    }
    
    
}
