/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanmingguke2;

/**
 *
 * @author LENOVO
 */
public class Tabungan {
    public int saldo;
    
    
    public Tabungan(int saldo){
        this.saldo = saldo;
    }
    
    public void ambilUang(int jumlah){
          this.saldo -= jumlah;      
    }

    public void simpanUang(int jumlah){
        this.saldo += jumlah;
    }

    public int getSaldo() {
        return saldo;
    }
    
    
}
