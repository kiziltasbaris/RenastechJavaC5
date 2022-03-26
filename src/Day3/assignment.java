package Day3;

import java.util.Scanner;

public class assignment {

    public static void main(String[] args) {

       double tutar1 , tip1=0.18 , tip2=0.20;

        Scanner myObj = new Scanner(System.in);

        System.out.println("total bill : ");
         tutar1 = myObj.nextInt();



        if (tutar1 <= 99 || tutar1 >= 280) {

            System.out.println( "the tip is "+ tutar1 * 0.20);
        }

        else {

            System.out.println("the tip is" + tutar1 *0.20);


        }











    }
}


