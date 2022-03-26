package Day10;

public class StringMethods {

    public static void main(String[] args) {


        //is empty() checks whether a string is empty or not        boolean

        String school = "Renastech";

        System.out.println(school.isEmpty()); //false

        String s1 = "";
        boolean b1  = s1.isEmpty(); //true

        System.out.println(b1); // true because there isnt any value inside the string.

        String name = " "; //space is a character.

        System.out.println(name.isEmpty()); //false;

        String myName = "Maryam";

        if (myName.isEmpty()){  //since my condition is false it will ignore the statement/body

            System.out.println("Hello world");
        }

        int number=34;
/*
        System.out.println(number.isEmpty());  We will get an error since my variable is int */


        //length()     Returns the length of a specified string

        String s2 = "Renastech";

        System.out.println(s2.length()); //9


        System.out.println("////////////////");

        String s3 = "Java"; // 4
        System.out.println(s3.length()); //4

        System.out.println("//////////////////");

        String s4 = " ";

        System.out.println("s6 length is = " + s4.length());

        System.out.println("//////////////////////////////////////////////////////////////");


        String name2="Java";
        //index ====0123

        System.out.println("name2 length is :" + name2.length()); //name2 length is 4

        System.out.println(name2.charAt(3)); // index 3 ==a



        System.out.println("///////////////////////////////////////////////////////////");



        String str1 = "Sinan";

        System.out.println("str1.length() = " + str1.length()); // str1.length() = 5

        System.out.println("str1.charAt() " + str1.charAt(4)); // 4



        System.out.println("//////////////////////////////////////////////////////////");






    }
}
