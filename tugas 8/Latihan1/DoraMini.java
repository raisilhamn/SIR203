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
public class DoraMini extends Robot{
    
    public void sayDora(){
        System.out.println("Halo, Saya Dora Mini");
    }

    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    @Override
    public void displayData() {
        System.out.println("nama : " + super.nama);
        System.out.println("tahun pembuatan : " + super.tahun);
    }
    
    
    
    
    
}
