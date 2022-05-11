package day17;

import java.util.Arrays;

public class Strings {

    public static void main(String[] args) {

/*
        String name ="Chad";
        String reverseName="";

        String[]splitedSentence=name.split("");
        System.out.println(Arrays.toString(splitedSentence));

        for (int i= splitedSentence.length-1;i>=0;i--){
            reverseName=reverseName+splitedSentence[i] ;
        }

        System.out.println(reverseName);
*/


       String name = "Omer";
       String x="";
       char[]letters=name.toCharArray();
       String[]sentence=name.split(" ");
       String[]reverseName=name.split("");

       for (int i=reverseName.length-1;i>=0;i--){
           x+=reverseName[i];

       }

       System.out.println(x);
       System.out.println(Arrays.toString(sentence));
       System.out.println(letters[1]+ " : This is first index");
       System.out.println(letters[3] + " : This is third index");







        }
    }

