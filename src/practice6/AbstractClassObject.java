package practice6;
/*
* Abstract class can not instantiate (create object in super class)
* */
public class AbstractClassObject {
    public static void main(String[] args) {
        //AbstractClass abstractClass = new AbstractClass();//Abstract class object can not be created
        AbstractClassSubClass abstractClassSubClass = new AbstractClassSubClass();

    }
}
