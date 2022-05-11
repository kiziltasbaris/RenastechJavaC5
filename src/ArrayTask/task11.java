package ArrayTask;

import java.util.ArrayList;

public class task11 {

    public static void main(String[] args) {


        String[]arr1={"A","B","C"};
        String []arr2={"D","E","F","G"};

        int x = arr1.length+arr2.length;

        ArrayList<String>List=new ArrayList<>(x);

        for (int i =0; i< arr1.length;i++){
            List.add(arr1[i]);
        }

        for (int i=0; i< arr2.length;i++){
            List.add(arr2[i]);
        }

        System.out.println(List);


    }
}

