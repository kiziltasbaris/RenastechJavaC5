package JavaPractice;

public class a7_swapTwoIntegers {

    public static void main(String[] args) {

        //Swap two integers without using temp/third variable

        int x=5;
        int y=10;

        // x=10 , y=5


        //1. with using third variable :t
        int t;
        t=x;//5
        x=y=10; //10
        y=t;

        System.out.println(x);
        System.out.println(y);

        //2.without using third variable : using + operator

        x=x+y; //15
        y=x-y; //5
        x=x-y; //10

        //3.without using third variable : using*operator
        x=x*y;//50
        y=x/y;//5
        x=x/y;//10









    }
}
