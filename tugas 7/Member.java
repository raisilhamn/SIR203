package mingguke7latihan;

public class Member {

    protected String nama;
    protected int umur;
    protected boolean status = false;
    
    public Member(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
        
    }
    
    public void setUmur(int umur){
        this.umur = umur;
    }
    
    public void display(){
        System.out.println("nama : " + this.nama);
        System.out.println("umur : " + this.umur);
    }
}
