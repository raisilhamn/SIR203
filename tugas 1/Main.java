package tugas.minggu1;

import java.util.*;
public class Main {


    public static void main(String[] args) {
        
        MyArray arr = new MyArray(3);
        arr.display();
//        int x = arr.getSize();
//        System.out.println(x);
        
        arr.rand(10);
        arr.display();
        
        arr.insert(12);
        arr.display();

        int x = arr.getSize();
        System.out.println(x);
        
        arr.setElement(0,25);
        arr.display();
//        
        int a = arr.getElement(0);
        System.out.println(a);
        
        MyArray s;
        s = arr.copy();
        s.display();
    }
    
}
