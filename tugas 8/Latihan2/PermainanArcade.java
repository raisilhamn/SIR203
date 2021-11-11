package mingguke8.Latihan2;
import java.util.Random;


public class PermainanArcade extends Permainan {
    
    Random rand = new Random();
    
    @Override
    public int hitungSkor(int hit, int miss) {
        return (hit * 3) - miss;
    }
    
    
    @Override
    public void jalankan() {
        super.jalankan(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Skor : " + hitungSkor(rand.nextInt(10), rand.nextInt(10)));
    }
    
    
    

}
