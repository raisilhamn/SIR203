
package mingguke8.Latihan2;

public class Main {
    public static void main(String[] args) {
  
        PermainanArcade a1 = new PermainanArcade();
        a1.setNamaPemain("Rais ilham");
        a1.setLevelPemain(10);
        a1.jalankan();  
        
        System.out.println("=========");
        
        PermainanStrategy s1 = new PermainanStrategy();
        s1.setNamaPemain("Rais ilham");
        s1.setLevelPemain(20);
        s1.jalankan();
        
        
    }
}
