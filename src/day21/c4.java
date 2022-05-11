package day21;

import java.util.Arrays;

public class c4 {


    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        String [] names={"b" ,"LA","AS","HIC" , "G"};
        char [] letters={'M','l','a' , 'h' , 'g' , 's'};
        char[]letters2={'C','K','D'};

        Arrays.sort(names);  // definition: ArraySort is line up all the letters by alphabetic order.
        Arrays.sort(arr);    //Definition; ParseMethod is turning letters to alphabetic order to number order.
        Arrays.sort(letters); //[M, a, g, h, l, s]
        Arrays.sort(letters2);

        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(letters));
        System.out.println(Arrays.toString(letters2));


        System.out.println(concatenation("hello", "world", "java"));
        System.out.println(concatenation("hello", "world"));
    }

    //task create method that concats 2 string
    //task create method that concats 3 string

    public static String concatenation(String str1,String str2){

        return str1.concat("," + str2) ;
    }


    public static String concatenation(String st1,String st2, String st3){
        return st1.concat(" " + st2).concat(" "+st3);


    }

}
