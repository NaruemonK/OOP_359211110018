package ooplab5;
//1.allow user input data into array อินพุต โชว์ดาต้า อินพุต20ค่า เป็นอินทีเจ้อ
//2.find summation of data in array
//3.find average value in array
//4.find maximum  value in array
//5.find minimum  value in array
//6.sorting data in array (Descending order)
//7sorting data in array (Ascending order)

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortingArray {
    private static int MAX = 5;

    public static void main(String[] args) {
        Integer[] num = new Integer[MAX];
        inputData(num);
        num = showData(num);
        findSummation(num); //หาค่าผลรวมข้อมูลที่อยู่ในอาเรย์ทั้งหมด
        findMAX(num);
        findMin(num);
        DescendingOrder(num);
        AscendingOrder(num);
    }//main

    private static void AscendingOrder(Integer[] num) {
        System.out.print("Ascending Order: ");
        Arrays.sort(num,Collections.reverseOrder());
        showData(num);  //เรียงลำดับ ข้อมูลจากน้อยไปมาก  และ  มากไปน้อย
    }//AscendingOrder

    private static void DescendingOrder(Integer[] num) {
        Arrays.sort(num);
        System.out.print("Descending Order: ");
        showData(num); //showData(Arrays.sort(num)); // ได้ทั้ง2แบบ
    }//DescendingOrder

    private static void findMin(Integer[] num) {
        System.out.println("The Minimum is: "+ Collections.min(Arrays.asList(num))); //หาค่าน้อยสุด
    }//findMin

    private static void findMAX(Integer[] num) {
        System.out.println("The Maximum is: "+ Collections.max(Arrays.asList(num))); //หาค่ามากสุด

    }//findMAX

       private static void findSummation(Integer[] num) {
        Integer total=0;
        for (int val:num)
            total+=val;
        System.out.println("The summation is: "+total); //หาค่าผลรวมข้อมูลที่อยู่ในอาเรย์ทั้งหมด
        findAverage(total);
    }//findSummation

    private static void findAverage(Integer total) {
        System.out.println("The Average is: "+total/MAX);
    }

    private static Integer[] showData(Integer[] num) {
        System.out.println("Data in array: ");
        //enchance loop
        for (int i : num) {
            System.out.println(i + " ");
        }
        System.out.println();
        return num;
    }
        private static Integer[] inputData(Integer[] num) {
        Scanner scanner = new Scanner(System.in); //รับค่าข้อมูล
        System.out.println("Please enter an integer: ");
        for (int i=0;i<num.length;i++){
            System.out.print("num["+i+"]: ");
            num[i] = scanner.nextInt();

        }
        return num;
    }//inputData
}//class
