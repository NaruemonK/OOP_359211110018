package ooplab77;

import java.util.Scanner;

public class mySuperCar {
    public static void main(String[] args) {
        SuperCar c1 = new SuperCar();
        c1.setCarbrand("TOYOTA");
        c1.setCarcolor("BLACK");
        c1.setCarenginesize("1999");
        c1.setMaxspeed("200");
        c1.setCountry("Thailand");

        getSuperCarinfo(c1);

      SuperCar c = new SuperCar();
      c = inputData(c);


    }//main

    private static void getSuperCarinfo(SuperCar c1) {
        System.out.println("supercer info: ");
        System.out.println("Carbrand: "+ c1.getCarbrand());
        System.out.println("Carcolor: "+ c1.getCarcolor());
        System.out.println("Carenginesize: "+ c1.getCarenginesize());
        System.out.println("Maxspeed: "+ c1.getMaxspeed());
        System.out.println("Country: "+ c1.getCountry());

    }

    private static SuperCar inputData(SuperCar c) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter supercar info: ");
        System.out.print("Enter Carbrand: ");
        c.setCarbrand(scanner.nextLine());
        System.out.print("Enter Carcolor: ");
        c.setCarcolor(scanner.nextLine());
        System.out.print("Enter Carenginesize: ");
        c.setCarenginesize(scanner.nextLine());
        System.out.print("Enter Maxspeed: ");
        c.setMaxspeed(scanner.nextLine());
        System.out.print("Enter Country: ");
        c.setCountry(scanner.nextLine());

        return c;
    }

}//class
