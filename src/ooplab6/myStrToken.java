package ooplab6;

import java.util.StringTokenizer;

public class myStrToken {
    public static void main(String[] args) {
       // StringTokenizer นับ ข้อความ ที่อยู่ใน ประโยค ว่ามีกี่ คำToken //นับคำ และ ตัดคำ
        String msg = "Welcome to RMUTSV"; // มี 3 คำ
        StringTokenizer myToken = new StringTokenizer(msg);
        System.out.println(myToken.countTokens());

        while (myToken.hasMoreTokens()){
            StringBuffer mybuff = new StringBuffer(myToken.nextToken()); //อ่าน คำ ที่ละ คำ
            System.out.print(mybuff.reverse()+" ");

        }


    }//main
}//class
