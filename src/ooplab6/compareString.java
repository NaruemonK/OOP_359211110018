package ooplab6;

import javax.management.DynamicMBean;

public class compareString {
    public static void main(String[] args) {
        //compareString มี3 แบบ

        //แบบ1 (==)
        String m = "Hello";
        String n = "Hello";
        if(m==n)System.out.println("yes.");
        else System.out.println("no.");

        //แบบ 2 (equal()) //ผลลัพธ์จะได้ จริง และ เท็จ
        if(m.equals(n)) System.out.println("yes.");
        else System.out.println("no.");

        //แบบ 3 (compareTO()) ผลลัพธืที่ได้ 0,1,-1
        if (m.compareTo(n)==0)System.out.println("yes.");
        else if (m.compareTo(n)>=1)
            System.out.println("no. +"); //มีค่ามากกว่า 0 ทางขวา มากกว่า ซ้าย
        else System.out.println("no. -");//ซ้าย มีค่ามากว่า ขวา





    }//main
}//class
