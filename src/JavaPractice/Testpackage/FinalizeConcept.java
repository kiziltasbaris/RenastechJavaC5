package JavaPractice.Testpackage;

public class FinalizeConcept {

    public  void finalize(){
      System.out.println("finalize method");
    }
//finalize is a method
// finally is a block
// final is a keyword


    public  static void main(String[] args) {

        FinallyConcept f1 = new FinallyConcept();
        FinallyConcept f2 = new FinallyConcept();

        f1=null;
        f2=null;

        System.gc();




    }
}
