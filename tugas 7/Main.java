package mingguke7latihan;

public class Main {
    public static void main(String[] args) {
        Tim t = new Tim();
        t.setNama("Tim T");
        
        Member m1 = new Member("Melody", 23);
        Member m2 = new Member("Haruka", 23);
        Member m3 = new Member("Kinal", 19);
        
        Trainee t1 = new Trainee("Alicia", 17, 3);
        Trainee t2 = new Trainee("Indah", 17, 5);
        
        
        t.setMember(m1);
        t.setMember(m2);
        t.setMember(m3);
        t.setMember(t1);
        t.setMember(t2);
        
        System.out.println("Full member");
        t.displayFullMember();
        System.out.println("\nTrainee");
        t.displayTrainee();


    }
    
}
