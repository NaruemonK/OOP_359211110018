package ooplab5;

public class OperatorArray {
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5};
        int num2[] = num;
        int num3[] = {1,2,3,4,5};
        if (num==num3)//ชี้คนละตำแหน่งกัน เป็นเท็จ
            System.out.println("true");
        else
            System.out.println("false");
        if (num==num2)//เป็นจริง
            System.out.println("true");
        else
            System.out.println("false");
        num[0] = 100;
        System.out.println(num2[0]);
        num2[4] = 500;
        System.out.println(num[4]);  //จะเท่ากันต่อเมื่อชี้ไปตำแหน่งเดียวกันเท่านั้น
    }//main
}//class
