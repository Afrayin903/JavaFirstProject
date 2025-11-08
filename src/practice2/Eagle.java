package practice2;

public class Eagle extends Animal implements Flyable{
    public Eagle(String name, String size, String breed, char gender, int age, String color) {
        super(name, size, breed, gender, age, color);
    }

    @Override
    public String flyable() {
        return null;
    }
}
