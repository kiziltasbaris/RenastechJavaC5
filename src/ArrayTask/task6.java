package ArrayTask;

import java.util.Arrays;

public class task6 {

    public static void main(String[] args) {

        /// create a java logic that will count letter a or A from given string
//    //example
//    //JavA
//    //output should be 2

       String name = "Baris Kiziltas";

       int count=0;
       String[] words = name.split("");
       System.out.println(Arrays.toString(words));


        for (String x:words) {

            if (x.equalsIgnoreCase("i")){
                count++;
            }
        }

       System.out.println("Count is :" + count);
    }
}
