package ArrayTask;

import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {

        ///write a program that can return the largest string of text from an array

        String[] names = {"hello", "world", "java", "python", "sevgin", "renastechschool"};

        int max=names[0].length();
        String result="";

        for (int i=0 ; i<names.length;i++){
            if (names[i].length()>max){
                result=names[i];

            }


        }
                System.out.println("The largest String is an array " + result);

                  System.out.println("*************************************");


        //write a program that can return the shortest string of text from an array

        String[] name = {"hello", "world", "js", "python", "sevgin", "renastechschool"};

        int min = name[0].length();
        String result1="";

        for (int i=0;i<name.length;i++){

            if (name[i].length()<min){
                result1=name[i];
            }

        }
        System.out.println("The shortest :" +result1);



    }
}
