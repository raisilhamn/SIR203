/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mingguke8.Latihan1;

/**
 *
 * @author LENOVO
 */
public abstract class Robot {
    protected String nama;
    protected String pemilik;
    protected int tahun;
    
    
    public void setTahunPembuatan(int tahun){
        this.tahun = tahun;
    }

    public abstract void setNama(String nama);
    
    public abstract void displayData();
    
}
