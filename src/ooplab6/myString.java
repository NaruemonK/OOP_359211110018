package ooplab6;

public class myString {
    public static void main(String[] args) {
        String msg1 = "Naruemon Kaewmee";
        System.out.println(msg1);
        char []c = {'H','e','l','l','o'}; //char แปลงเป็น String
        String msg2 = new String (c);
        System.out.println(msg2);

        //concatenation String การต่อ String มี 2 แบบ
        // แบบ 1 ใช้เครื่องหมาย(+)
        String msg3 = msg2 +" "+ msg1; //การวรรค 1 ครั้ง นับเป็น 1 ตัวอักษร
        System.out.println(msg3);
        System.out.println(msg3.length());

        // แบบ 2 การใช้(concat())
        String msg4 = msg3.concat(" RMUTSV");
        System.out.println(msg4);

        System.out.println(msg4.toLowerCase());//พิมพ์เล็กทั้งหมด
        System.out.println(msg4.toUpperCase());//พิมพ์ใหญ่ทั้งหมด
        System.out.println(msg4.substring(5,10));//การตัดคำตำแหน่งที่ 5 ถึง 10

        //trim() ทำหน้าที่ในการตัด ซ้าย ขวา ออก
        String msg5 = " Hello ";
        System.out.println("*"+msg5+"*");
        System.out.println("*"+msg5.trim()+"*");

    }//main
}//class
