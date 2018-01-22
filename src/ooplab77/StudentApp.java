package ooplab77;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        //create object as Student เก็บค่าข้อมูลต่างๆ ของ oj ไว้
        Student s1 = new Student(); //มาจาก class Student ***ข้อมูลผูกติดกับ s1,2,3 // set สร้าง ppt ของ class
        s1.setId("111111111111"); // s1.setId เปลี่ยนแปลงค่าที่อยู่ใน ppt นั้นๆ                    // get อ่านค่า ppt ออกมาแสดง
        s1.setName("Boy Saiyai");
        s1.setMajor("Information System");
        s1.setGroup("IS221");

        Student s2 = new Student("222222222222","Girl Saiyai","Maketing","MK221");
        //เรียก constructor ของ Student

        showData(s1); //สร้าง method showData เรียกชื่อที่ 1
        showData(s2); //เรียกชื่อที่ 2

        Student s3 = new Student(); //user input ค่าเข้ามา เก็บใน s3
        //s3 = inputData(s3);

        //test
        System.out.println(Student.faculty);



    }//main

    private static Student inputData(Student s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter student info: ");
        System.out.print("Enter student ID: ");
        s.setId(scanner.nextLine()); //อ่านค่าข้อมูลที่ user พิมเข้ามา แล้วส่งไป setId
        System.out.print("Enter student name: ");
        s.setName(scanner.nextLine());//อ่านค่าข้อมูลที่ user พิมเข้ามา แล้วส่งไป setName
        System.out.print("Enter student major: ");
        s.setMajor(scanner.nextLine());//อ่านค่าข้อมูลที่ user พิมเข้ามา แล้วส่งไป setMajor
        System.out.print("Enter student group: ");
        s.setGroup(scanner.nextLine());//อ่านค่าข้อมูลที่ user พิมเข้ามา

        return s;

    }//inputData

    private static void showData(Student s) {   //Method ShowData //s มาพร้อมกันทั้งหมด มาเป็นก้อน
        System.out.println("Student info: ");
        System.out.println("ID: "+ s.getId());
        System.out.println("Name: "+ s.getName());
        System.out.println("Major: "+ s.getMajor());
        System.out.println("Group: "+ s.getGroup());



    }//showData


}//class
