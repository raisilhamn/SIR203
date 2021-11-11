
package mingguke8.Latihan1;

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
