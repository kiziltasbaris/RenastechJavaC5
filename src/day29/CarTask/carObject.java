package day29.CarTask;

import day20.GenericUtils;
import day25.BMW;

public class carObject {

    public static void main(String[] args) {
        Audi audi=new Audi();
        audi.startCar();
        audi.consume();
        audi.stopCar();

        GenericUtils.Stars();

        BMW bmw=new BMW();
        bmw.startCar();
        bmw.consume();
        bmw.stopCar();

        GenericUtils.Stars();

        Tesla tesla=new Tesla();
        tesla.startCar();
        tesla.consume();
        tesla.stopCar();
    }
}
