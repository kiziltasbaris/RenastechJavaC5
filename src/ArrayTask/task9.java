package ArrayTask;

import day20.GenericUtils;

import java.util.ArrayList;

public class task9 {

    public static void main(String[] args) {

        //   write a program that can print the list of integers in reversed order
//    ex:
//      list=> {1,2,3,4,5,6}
//      output: 6 5 4 3 2 1


//

        ArrayList<Integer>rnumbers = new ArrayList<>();
        rnumbers.add(1);
        rnumbers.add(2);
        rnumbers.add(3);
        rnumbers.add(4);
       rnumbers.add(5);
        rnumbers.add(6);

        GenericUtils.Stars();

        int[]numbers={1,2,3,4,5,6};



        for (int x = numbers.length-1; x>=0 ;x--){

            rnumbers.add(numbers[x]);


        }

        System.out.print(rnumbers);







    }
}
