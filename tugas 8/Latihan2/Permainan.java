package mingguke8.Latihan2;

public abstract class Permainan {
    private String namaPemain;
    private int levelPemain;

    public void setLevelPemain(int levelPemain) {
        this.levelPemain = levelPemain;
    }

    public void setNamaPemain(String namaPemain) {
        this.namaPemain = namaPemain;
    }

    public int getLevelPemain() {
        return levelPemain;
    }

    public String getNamaPemain() {
        return namaPemain;
    }
    
    public abstract int hitungSkor(int hit, int miss);
    
    public void jalankan(){
        setLevelPemain(levelPemain);
        setNamaPemain(namaPemain);
        System.out.println("Nama : " + getNamaPemain());
        System.out.println("Level : " + getLevelPemain());
        if (getLevelPemain() <= 20) {
            System.out.println("Level normal");
        }
        else if (getLevelPemain() > 20 && getLevelPemain() <= 80){
            System.out.println("Level medium ");
        }
        else{
            System.out.println("Level Hard");
        }
    }
    
    
    
}
