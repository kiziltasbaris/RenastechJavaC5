package JavaPractice.Testpackage;

public class FinallyConcept {

    public static void main(String[] args) {
            //test1();
        //test2();
        division();
      //  division2();
    }

    public static void test1(){

        try {
            System.out.println("inside test1 method");
            throw new RuntimeException("test");
        }

        catch (Exception e){
            System.out.println("inside catch block");
        }

        finally {
            System.out.println("inside finally block");
        }
    }

    public static void test2(){

        try {
            System.out.println("inside test2");
        }
        finally {
            System.out.println("finally code in test2 method");
        }






    }
    //IT CAN BE INTERVIEW QUESTION
    public static void division(){
        int i=10;
        try {
            System.out.println("inside try block");
            int k = i/0;
        }

        catch (ArithmeticException e){
            System.out.println("Inside catch block");
            System.out.println("divide by zero error");
        }

        finally {
            System.out.println("execute this code even after any exception");
        }


    }


//NOTES : ArithmeticException will be catch block the terminal but when you put NullPointerException it will skip the catch block.

    public static void division2(){
        int i=10;
        try {
            System.out.println("inside try block");
            int k = i/0;
        }

        catch (NullPointerException e){
            System.out.println("Inside catch block");
            System.out.println("divide by zero error");
        }

        finally {
            System.out.println("execute this code even after any exception");
        }


    }


}
