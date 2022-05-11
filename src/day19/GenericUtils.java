package day19;

public class GenericUtils {

    public static void Hello() {
        System.out.println("Hello World");
    }

    public static void reverseString(String name) {

        String reversedResult = "";

        for (int i = name.length() - 1; i >= 0; i--) {

            reversedResult += name.charAt(i);

        }
        System.out.println("reversedResult = " + reversedResult);


    }
}


