package day21;

public class c3 {


    //Can we overload a main method
    //technically yes we can overload
    //but overloaded method can't run class
    //in order to run other main methods we will have to call them in (String [] args)
    public static void main(String[] args) {
        System.out.println("Default String main");

        int [ ] arr={1,2,3};
        main(arr);

    }

    public static void main(int [] arr){
        System.out.println("int main");
        System.out.println(2342);
    }
    public static void main(double [] arr2){
        System.out.println("double main");
    }



}
