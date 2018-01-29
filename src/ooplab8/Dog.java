package ooplab8;

public class Dog extends Pet{
    //SubClass ใหญ่กว่า superClass คือ Pet
    //superClass คือ Dog
    public Dog(String name, String nairColor, String gender, int age) {
        super(name, nairColor, gender, age); //เรียกใช้งานจาก superClass
    }

    @Override
    public void makenoise() {
        System.out.println("Box Box !!!");
    }
}//Dog
