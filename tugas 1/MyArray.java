package tugas.minggu1;
import java.util.Random;

public class MyArray {
    private int[] data;
    private int maxSize;
    private int size;
    
    
    public MyArray(int maxSize){
        this.maxSize = maxSize;
        this.size = 0;
        this.data = new int[maxSize];
        for (int i = 0; i< this.maxSize; i++){
            this.data[i] = this.size;
        }
    }
    
    public void rand(int n){
        Random rand1 = new Random();
        for (int i = 0; i< this.data.length; i++){
            int a = rand1.nextInt(n);
            this.data[i] = a;
        }
    }
    public void display(){
        System.out.println("");
        for (int i = 0; i< this.data.length; i++){
            System.out.print(this.data[i] + " " );
        }
        System.out.println("");
    }
    public int getSize(){
        int hasilsize =0;
        for (int i =0;i<data.length;i++){
            if(data[i]!=0){
                hasilsize ++;
            }    
        }
        return hasilsize;
    }
    
    public void insert(int x){
        for (int i = (this.data.length - 1); i >= 0; i--) {
            if (i+1 < this.data.length) {
                this.data[i+1] = this.data[i];    
            }
        }
        this.data[0] = x;
    }
    
    public void setElement(int position, int element){
        this.data[position] = element;
    }
    
    public int getElement(int position){
        return this.data[position];
    }
    
    public MyArray copy(){
        MyArray arr = new MyArray(this.data.length);
        for (int i = 0; i< this.data.length; i++){
            arr.data[i] = this.data[i];
        }
        return arr;
    }
    
}
