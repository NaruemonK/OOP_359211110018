package ooplab8;

public class ShapeApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,20);
        System.out.println("width: "+rectangle.getWidth());
        System.out.println("Length: "+rectangle.getLength());
        System.out.println("Arae: "+rectangle.getArae());

        Triangle triangle = new Triangle(10,0,30);
        System.out.println(triangle.getArae());

    }//main
}//ShapeApp
