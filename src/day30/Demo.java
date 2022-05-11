package day30;


public class Demo {

    public static void main(String[] args) {
/*
        System.out.println("Start to program");

        int a=0;

        try {
            a=2/0;
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        System.out.println(a);
        System.out.println("Finish");


        OUTPUT
                Start to program
               / by zero
               0
               Finish
*/

        int[]arr=new int[3];
        try {
            arr[4]=10;
        }
         catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.toString());
         }

        finally {
            System.out.println("Finally");
        }

        System.out.println("Its done");





    }
}
