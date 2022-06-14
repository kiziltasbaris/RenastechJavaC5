package Patika;

public class demo1 {

    static int add(int a , int b){

        return a+b;

    }

    static int add2(int c , int d){

        return c+d;
    }

    static double add(int y,double x){
        return y+x;
    }

    public static void main(String[] args) {

        System.out.println(add(1,2));
        System.out.println(add2(2,3));
        System.out.println(add(2,3.0));
    }
}
