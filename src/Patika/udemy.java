package Patika;

public class udemy {

    public static void main(String[] args) {

        int [] arr= {1,2,4,5,6,8,9,10};

        for (int i=0;i<arr.length ; i++){

            if (arr[i] %2 == 0){
                System.out.println(arr[i]);



            }


            else {

                System.out.println(arr[i] + "is not multiple of 2");
            }


        }
    }
}
