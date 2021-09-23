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
public class Mahasiswa {
    private int nrp;
    private String nama;
    
    public  Mahasiswa(int nrp , String nama){
        this.nrp = nrp;
        this.nama = nama;
    }

    public int getNrp() {
        return this.nrp;
    }

    public String getNama() {
        return this.nama;
    }
    
}
