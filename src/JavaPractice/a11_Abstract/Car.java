package JavaPractice.a11_Abstract;

public interface Car {

    //only final and static variables
    final int wheels=4;

    // always define only abstract methods
    //no method body;
    //only method declaration
    //we achieve %100 abstraction


    public void start();
    public void stop();

}
