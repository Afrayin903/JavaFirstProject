package practice2;

public class Dog extends Animal {
    public Dog(String name, String size, String breed, char gender, int age, String color) {
        super(name, size, breed, gender, age, color);
    }

    public void bark(){
        System.out.println(name + " is barking");
    }

}
