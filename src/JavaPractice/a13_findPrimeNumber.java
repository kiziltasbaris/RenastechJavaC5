package JavaPractice;

public class a13_findPrimeNumber {

    //2 is the lowest prime number
    public static boolean isPrimeNumber(int num){

        if (num<=1){
            return false;
        }
        for (int i=2;i<num;i++){

            if (num%i==0){
                return false;
            }

        }

        return true;
    }

    public static void getPrimeNumbers(int num){
        System.out.println("prime number up to " + num);
        for (int i=2;i<=num;i++){
            if (isPrimeNumber(i))
            System.out.println(i+ " ");
        }
    }


    public static void main(String[] args) {

        //How to find Prime Number
        //Prime numbers are special numbers just divided itself.

        System.out.println(isPrimeNumber(10));

        getPrimeNumbers(7);
    }
}
