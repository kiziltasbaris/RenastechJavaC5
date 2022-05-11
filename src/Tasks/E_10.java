package Tasks;

public class E_10 {

    public static void main(String[] args) {

        double[]List={20,30,40};
        double x=E_10.x(List);
        System.out.println(x);

    }

    public static double x(double[]y){

        double num=0;
        for (int i=0;i<y.length;i++){
            num+=y[i];
        }

        return  num/y.length;
    }
}
