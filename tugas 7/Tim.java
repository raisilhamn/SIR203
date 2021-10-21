package mingguke7latihan;

import java.util.ArrayList;

public class Tim {

    private String nama;
    private ArrayList<Member> m = new ArrayList<>();

    public void setMember(Member m) {
        this.m.add(m);
    }

    public void displayFullMember() {
        m.forEach(m -> {
            m.display();
        });

    }

    public void displayTrainee() {
        m.forEach(m -> {
            if (m.status == true) {
                m.display();
            }
        });
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

}
