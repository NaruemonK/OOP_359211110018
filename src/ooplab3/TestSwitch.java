package ooplab3;

import java.util.Scanner;

public class TestSwitch{
    public static void main(String[] args) {
        int select;
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter number between 1-3: "); //ใส่เลข 1-3 ถ้าใส่ 3
//        select = scanner.nextInt(); //userใส่ค่าเข้ามา
//        //switch-case
//        switch (select){
//            case 1: System.out.println("You enter 1"); break;
//            case 2: System.out.println("You enter 2"); break;
//            case 3: System.out.println("You enter 3"); break; // ตรงกับอันนี้ ***อย่าลืมใส่ break เสมอ***
//            default: System.out.println("Please enter number between 1-3, Thank you");
//        }//switch

        char c = 'A';
        switch (c){
            case 'A': System.out.println("A ant"); break;
            case 'B': System.out.println("B bird"); break;
            case 'C': System.out.println("C cat");break;
            default: System.out.println("Please enter new, Thank you");
        }



    }//maia

}//class
