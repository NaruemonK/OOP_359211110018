package ooplab8;
//เป็นแอพที่ใช้ติดต่อกับผู้ใช้
public class PetApp {
    public static void main(String[] args) {
        Dog dog = new Dog("Bow",
                "white",
                "Female",
                2);
        System.out.println(dog.toString());

        Cat cat = new Cat("Tan",
                "black",
                "Female",
                3);
        System.out.println(cat.getClass()+" "+cat.toString());
        dog.makenoise();
        cat.makenoise();
                                //***********อยู่ในเอกสาร หน้าที่9 บทที่8*********
    }//main
}
