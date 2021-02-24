// Assignment 3

public class Rectangle {
    // Instance variables
    int length;
    int width;

    // Constructor
    public Rectangle(){
        length = 0;
        width = 0;
    }
    public Rectangle(int length, int breadth){
        this.length = length;
        this.width = breadth;
    }
    public int getLength(){
        return this.length;
    }

    public void setLength(int l){
        this.length = l;
    }

    public int getWidth(){
        return this.width;
    }

    public void setWidth(int w){
        this.width = w;
    }

    public int area(){
        return length*width;
    }

    public void display(){
        System.out.println("Length of rectangle is: "+length);
        System.out.println("Width of rectangle is: "+width);
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(10, 5);
        System.out.println(r1.getLength());
        System.out.println(r2.getLength());
    }
}
