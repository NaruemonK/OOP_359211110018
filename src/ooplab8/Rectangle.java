package ooplab8;

public class Rectangle extends Shape {

    public Rectangle(int width, int length) {
        super(width, length);
    }

    @Override
    public double getArae() {
        return super.getWidth()*super.getLength(); // ต้องเรียกใช้ด้วยคำสั่ง super
    }
}
