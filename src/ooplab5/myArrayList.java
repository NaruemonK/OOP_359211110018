package ooplab5;

import java.util.ArrayList;

public class myArrayList {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList(); //myList เรียกใช้แมทตอดภายใน ArrayList
        //add method
        myList.add("TAN");
        System.out.println(myList);
        myList.add("NUK");
        myList.add("G-BO");
        System.out.println(myList);
        System.out.println(myList.size()); //นับจำนวนชื่อ
        myList.add(2,"Hello"); //แทรกเพิ่มในตำแหน่งที่ 2
        System.out.println(myList);
        myList.add(1,100);
        System.out.println(myList);
        myList.set(0,"Naruemon");// เปลี่ยนแปลงข้อมูล ณ ตำแหน่งนั้นๆ
        System.out.println(myList);
        myList.remove("Hello");//ลบทิ้ง
        System.out.println(myList);
        System.out.println(myList.indexOf(100));//หาค่า100ว่าอยู่ตำแหน่งใดใน
    }//main
}//class
