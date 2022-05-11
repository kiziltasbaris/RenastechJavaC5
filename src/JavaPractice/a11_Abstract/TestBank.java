package JavaPractice.a11_Abstract;

public class TestBank {

    public static void main(String[] args) {

        TdBank bank = new TdBank();  //object--->Heap
        bank.credit();
        bank.debit();                //reference--->Stack
        bank.loan();

        Bank b = new TdBank(); //This is polymorphism
        b.credit();
        b.debit();
        b.loan();
    }
}
