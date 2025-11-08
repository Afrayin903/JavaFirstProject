package practice2;

public class Parrot extends Animal implements Flyable{
    public Parrot(String name, String size, String breed, char gender, int age, String color) {
        super(name, size, breed, gender, age, color);
    }

    @Override
    public String flyable() {
        return null;
    }
}
