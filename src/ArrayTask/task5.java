package ArrayTask;

import java.util.Arrays;
import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {


        //create a java program that will ask for 5 string name to store in the array
//and print first and last letter from each string
//example
//input : berkan , firas ,merve ..
//output : bn , fs ,me


        String [] words = new String[5];
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter  words");

        for (int i=0;i< words.length;i++){
            words[i]=scn.nextLine();
        }

        System.out.println(Arrays.toString(words));


        for (String x:words) {
            System.out.println(x.charAt(0) + " " + x.charAt(x.length()-1) );

        }



    }
}
