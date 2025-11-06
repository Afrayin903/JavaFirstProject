package practice2;

public class Animal {
     public String name;
    public String size;
    public String breed;
    public char gender;
    public int age;
    public String color;

    public Animal(String name, String size, String breed, char gender, int age, String color) {
        this.name = name;
        this.size = size;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.color = color;
    }

    public void sleep (){
        System.out.println(name + " is sleeping");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
