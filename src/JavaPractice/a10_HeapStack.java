package JavaPractice;

public class a10_HeapStack {

    public static void main(String[] args) {

        int sum1=10;
        int sum2=20;


        sum2=sum1;
        sum1=30;

        System.out.println(sum2); //10

        int numbers[]=new int[]{1,2,3};
        int numbers2[]=new int[]{4,5,6};

        numbers2=numbers;
        numbers[0]=10;
        System.out.println(numbers2[0]);//10


    }
}
