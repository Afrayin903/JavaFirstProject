package practice;
abstract class Lion extends PolymorphismClass{
    public String name;
    abstract void run();

}
class Hyenas extends PolymorphismClass{
    public String name;

}
class Cheetah extends PolymorphismClass{
    public String name;

}

public class PolymorphismClass {
    public static String name;
    int age;
    String breed;



    public void eat (String name, int age, String breed){
        System.out.println(name + " eats meat. They belong to the " + breed + " family and can live " + age + " years.");
    }
    public static void main(String[] args) {
        //Polymorphism
        PolymorphismClass ref1 = new Lion() {

            @Override
            void run() {
                System.out.println(name + " is running for catch a antelope");
            }
        };

        //PolymorphismClass.name = "Lion";
        PolymorphismClass ref2 = new Hyenas();
        PolymorphismClass ref3 = new Cheetah();
        ref1.eat("Lion", 20, "Cat");
        ref2.eat("Hyenas", 15, "Dog");
        ref3.eat("Cheetah", 15, "Cat");

        //Lion obj1 = new Lion();//Can't be instantiate due to abstract class
        Hyenas obj2 = new Hyenas(); //Object type not reference type so not polymorphism
        String ele = obj2.name = "Cheetah";
        System.out.println(ele);
        Cheetah obj3 = new Cheetah();





    }
}
