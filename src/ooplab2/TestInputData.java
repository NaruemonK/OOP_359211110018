package ooplab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestInputData {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.printf("What is your name? :");
        String name = reader.readLine();
        System.out.println("your name is "+name);

    }//main
}//class
