package ooplab5;

public class myArray {
    private  static int MAX = 10;
    public static void main(String[] args) {
        //array
        int []num;
        num = new int[5];
//        System.out.println(num[0]);
//        System.out.println(num[1]);
//        System.out.println(num[2]);
//        System.out.println(num[3]);
//        System.out.println(num[4]);
//        System.out.println(num.length);
        showData(num);
        num[1] =100;
        num[3] = num[1] *3; //100*3=300ใส่ตำแหน่ง3
        num[5-1] = num[3] /50; //300/50=6ใส่ตำแหน่ง4
        //num[5] = 500; ใส่ไม่ได้ ไม่มีตำแหน่งที่ 5
        showData(num);
        int num2[] = new int[MAX]; // num2 มีค่า = 10
        showData(num2);

    }//main

    private static void showData(int[] num) {
        System.out.println("Data in array: ");
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
    }
}//class
