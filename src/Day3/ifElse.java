package Day3;

public class ifElse {
    public static void main(String[] args) {

        int number1=10;
        int number2=20;

        int max=0;
        String message = "";

        if(number1>number2){ //10>20 false
            max=number1; // Java wont run this line since if statement is false

        }

        else { //true

            message = " number 2 is maximum "  + max;
            System.out.println(message);



        }
    }


}
