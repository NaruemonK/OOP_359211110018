package ooplab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestInputData {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.printf("What is your name? :");
        String name = reader.readLine();
        System.out.println("your name is "+name);
        System.out.println("How old are you? :");
        int age = Integer.parseInt(reader.readLine());
        System.out.println("You are "+age+" Years old.");

        //Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Whare are you?: ");
        String address = scanner.nextLine();
        System.out.println("You from: "+address);
        System.out.println("You from: "+address);
        // testing push

    }//main
}//class
