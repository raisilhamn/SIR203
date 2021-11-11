
package mingguke8.Latihan1;

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
