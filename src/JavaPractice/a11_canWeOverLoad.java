package JavaPractice;

public class a11_canWeOverLoad {

    //Can we overload a main()method in Java?
    // Yes, we can overload the main method in Java, but When we execute the class JVM starts execution with public static void main(String[] args) method
    //same name different parameters

    //JVM ---> Java Virtual Machine



    public static void main(String[] args) {
        main("Test message");
        main(4);
        main(1+2);




    }

    public static void main(String args) {

System.out.println("main method 2");



    }

    public static void main(int a ) {

        System.out.println("main method3");
    }

    public static void main(int a ,int b){

        System.out.println("main method 4 ");
    }

}
