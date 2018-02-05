package ooplab9;

import ooplab8.Pet;

public class Cow extends Pet{
    public Cow(String name, String nairColor, String gender, int age) {
        super(name, nairColor, gender, age);
    }

    @Override
    protected void makenoise() {
        System.out.println("Mor Mor !!!");
    }
}//class
