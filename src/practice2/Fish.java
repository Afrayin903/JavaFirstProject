package practice2;

public class Fish extends Animal {
    public Fish(String name, String size, String breed, char gender, int age, String color) {
        super(name, size, breed, gender, age, color);
    }

    public void swim(){
        System.out.println(name + " is swimming");
    }

}
