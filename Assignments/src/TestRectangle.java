
import java.util.Scanner;
public class TestRectangle {
    public static void main(String[] args) {
        int l1, l2, l3, w1, w2, w3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of first rectangle: ");
        l1 = sc.nextInt();
        System.out.println("Enter the width of first rectangle: ");
        w1 = sc.nextInt();

        System.out.println("Enter the length of second rectangle: ");
        l2 = sc.nextInt();
        System.out.println("Enter the width of second rectangle: ");
        w2 = sc.nextInt();

        System.out.println("Enter the length of third rectangle: ");
        l3 = sc.nextInt();
        System.out.println("Enter the width of third rectangle: ");
        w3 = sc.nextInt();

        Rectangle r1 = new Rectangle(l1, w1);
        Rectangle r2 = new Rectangle(l2, w2);
        Rectangle r3 = new Rectangle(l3, w3);


        System.out.println(r1.getLength());
        System.out.println(r1.getWidth());

        System.out.println(r2.getLength());
        System.out.println(r2.getWidth());

        System.out.println(r3.getLength());
        System.out.println(r3.getWidth());

        System.out.println(r1.area());
        System.out.println(r2.area());
        System.out.println(r3.area());
    }
}
