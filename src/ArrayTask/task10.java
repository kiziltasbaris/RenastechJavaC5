package ArrayTask;

import java.util.ArrayList;

public class task10 {

    public static void main(String[] args) {
        //. Write a Java program to create a new array list, add some colors (string) and print out the collection.

        ArrayList<String>colors= new ArrayList<>();
        colors.add("Blue");
        colors.add("Black");
        colors.add("pink");


        for (String each:colors) {
            System.out.println(each);
        }

    }
}
