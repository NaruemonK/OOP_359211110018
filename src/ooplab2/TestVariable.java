package ooplab2;

public class TestVariable {
    public static void main(String[] args) {
        //Integer
        int i  ;
        i = 10 ;
        System.out.println("i = "+i);
        int j = 20;
        System.out.println("j = "+j);
        System.out.println("i+j = "+(i+j));

        //Double
        double v;
        v = 5.5;
        System.out.println("v = "+v);
        i = (int) v;
        System.out.println("i = "+i);

        //char
        char c = 'x';
        System.out.println("c = "+c);

        //String
        String s;
        String s1 = "Hello world";
        System.out.println(s1+" I'm TAN");
        int x = s1.length();
        System.out.println("x = "+x);
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.concat(" Naruemon"));

        //String to int
        String number = "50";
        int y = Integer.parseInt(number);
        System.out.println("y = "+y);

        //Boolean
        boolean b = true;
        System.out.println(b);
        b = false;
        System.out.println(b);

        //short cut operator
        int z = 10;
        int a = ++z;
        System.out.println(z);
        System.out.println(a);





    }//main
}//class
