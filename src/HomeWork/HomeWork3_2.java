package HomeWork;
import  java.util.Scanner;
public class HomeWork3_2 {
    public static void main(String[] args) {
        int id = getID();
        String name = getName();
        float salary = getSalary();
        float over = getoverTime();
        showDataInfo(id,name,salary,over);
    }

    private static void showDataInfo(int id, String name, float salary, float over) {
        HomeWork3_2 w = new HomeWork3_2();
        System.out.println("getID : "+ id);
        System.out.println("getName : "+ name);
        System.out.println("getSalary : "+ salary);
        System.out.println("getOverTime :"+over);
        System.out.println("Tax is : " + w.calculatetax(salary,over));

    }

    private int calculatetax(float a, float b) {
        float sum = b+a;
        if (sum>=100000){
            return  10;
        }
        else  if (sum>=70000){
            return  7;
        }
        else  if (sum>=50000){
            return  3 ;
        }
        else  if (sum>=30000){
            return 3;
        }
        else {
            return  1;
        }
    }

    public static int getID() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter ID : ");
        int ID = in.nextInt();
        return ID;
    }

    public static String getName() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter you Name : ");
        String name = in.nextLine();
        return name;
    }

    public static float getSalary() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter you salary : ");
        float salary = in.nextFloat();
        return salary;
    }

    public static float getoverTime() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter you Overtime : ");
        float overTime = in.nextFloat();
        return overTime;
    }
}
