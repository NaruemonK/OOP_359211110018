package ooplab8;

public class Cat extends Pet{
    public Cat(String name, String nairColor, String gender, int age) {
        super(name, nairColor, gender, age);
    }

    @Override
    public void makenoise() {
        System.out.println("Meaw Meaw !!!");
    }
}//Cat
