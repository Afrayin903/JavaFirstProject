package practice2;

public class Cat extends Animal{
    public Cat(String name, String size, String breed, char gender, int age, String color) {
        super(name, size, breed, gender, age, color);
    }

    public void scratch(){
        System.out.println(name + " is scratching");
    }
}
