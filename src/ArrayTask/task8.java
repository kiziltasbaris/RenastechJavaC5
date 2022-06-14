package ArrayTask;

import day20.GenericUtils;

import java.util.ArrayList;

public class task8 {

    public static void main(String[] args) {


        //write a return method that will print max number from arraylist
        //write a return method that will print min number from arraylist


        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

            System.out.println("Numbers is" + numbers);

        GenericUtils.Stars();


        int max = numbers.get(0);
        int min = numbers.get(0);


        for (int x:numbers) {

            if (x>max){
                max=x;
            }

            if (x<min){
               min=x;
            }

        }

        System.out.println("Max number is :" + max);
        System.out.println("Min number is : " + min);




    }
}
