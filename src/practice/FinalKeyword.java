package practice;

public class FinalKeyword {
    public final String soccer;
    /* final var has to initialized otherwise throw compile error
     (Create constructor can be resolved error),
     but final static can not be resolved even create constructor.
     final static var error get resolve by create static initializer*/
    public final static double PI;
    public FinalKeyword(String soccer){
        this.soccer = soccer;
    }

    static {
        PI = 3.14;
    }

    public static void main(String[] args) {
        //final var can not be re-assign
        final int number = 10;
        //number = 20;
    }
    //Has to add final keyword if method doest want different implementation(override in subclass)
    public final void method(){
        System.out.println("Java programming");//implementation
    }
}

class AB extends FinalKeyword {

    public AB(String soccer) {
        super(soccer);
    }
 // Final method can not be overriding from the parent class FinalKeyword

}
