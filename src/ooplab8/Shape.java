package ooplab8;
//Abstract Class               ************อยู่ในเอกสารหน้าที่ 10 บทที่8**************

public abstract class Shape {
    private int width; //กว้าง
    private int length; //ยาว

    public abstract double getArae(); //Abstract Methord ต่างคือมี ; คราสใดที่จะสืบทอด ต้องทำการ abstract int ใหม่


    public Shape(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}//Shape
