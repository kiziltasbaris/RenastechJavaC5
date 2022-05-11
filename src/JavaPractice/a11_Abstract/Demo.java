package JavaPractice.a11_Abstract;



public class Demo {

    public static void main(String[] args) {

        //Handle with numbers

        int a[]={1,2,4,5};
        int sum=0;

        for (int i=0;i<a.length;i++){

            sum=sum+a[i];

        }
        System.out.println(sum); //This is total OUTPUT:12

        int sum1=0;

        for (int j=-1;j<=10;j++){  //10987654321

            sum1=sum1+j;
        }
        System.out.println(sum1);
        System.out.println("missing number is : " + (sum1-sum));
    }
}
