package ArrayTask;

import java.util.Arrays;

public class task3 {

    public static void main(String[] args) {

        int [] arr={2,90,4,-99, 99,73};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] biggestToSmallest=new int[arr.length];
        int x=0;
        for (int i=arr.length-1 ;i>=0 ; i--){

            biggestToSmallest[x]=arr[i];
            x++;


        }
        System.out.println(Arrays.toString(biggestToSmallest));
    }
}
