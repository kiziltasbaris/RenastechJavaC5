package codingTask;

public class task6 {

    public static void main(String[] args) {

        int x=20;
        int y=10;
        int z;
        System.out.println("Number 1:"+x+", Number 2: "+y);
        z=x;
        x=y;
        y=z;
        System.out.println("After swap, Number 1: "+x+", Number 2: "+y);
    }
}
