package HomeWork;
import  java.util.Scanner;

public class HomeWork3_1 {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      HomeWork3_1 w = new HomeWork3_1();
      for ( int i = 1; i < 4 ; i++) {
          System.out.print("Enter year " + i + " : ");
          int a = in.nextInt();
          System.out.println("Age " + i + ": " + w.calculate(a));
      }
          System.out.println("Thank you.");

    }

    private int calculate(int w) {
        int sum;
        return  sum = 2561-w;
    }

}
