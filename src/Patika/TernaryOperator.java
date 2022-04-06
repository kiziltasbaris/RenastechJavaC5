package Patika;

public class TernaryOperator {

    public static void main(String[] args) {

        //Ternary :Shortcut of if else
        // : means else
        // ? means if

          // (condition) ? == if block
          // : (Condition) ? == else if block
          // :                == else if block

        //Task 1 - max number
        //print max numbers between 2 numbers

        //Task 2 - Credit Score
        // 0-300 Poor
        // 301-600 Good
        // 601-800 Very good

        int number1=25 , number2=35 , max,  max2;

        if(number1>number2){
            max=number1;
        }
        else{
            max = number2;
        }

        // (condition) ? == if block
        // : (Condition) ? == else if block
        // :                == else if block

        max2=(number1>number2)? number1:number2;

        System.out.println("max =" + max);

        System.out.println("max2 =" + max2);

        //Task 2 - Credit Score
        // 0-300 Poor
        // 301-600 Good
        // 601-800 Very good


        int score=450;
        String result;

        if (score>0 && score<301){
            result="poor";
        }
        else if (score>301 && score<601){
            result="good";
        }
        else {

            result="invalid score";
        }

        // (condition) ? == if block
        // : (Condition) ? == else if block
        // :                == else if block

        String result2;


       result2= (score>0 && score<301) ? "poor" : (score>=301&&score<601)? "good": (score>=601 && score<800) ? "Very good" : "invalid score";




    }
}
