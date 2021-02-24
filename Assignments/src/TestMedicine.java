// Assignment 3

import java.util.Random;
import java.util.Scanner;
public class TestMedicine {
    public static void main(String[] args) {
        Medicine[] arr = new Medicine[10];
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int choice;
        do {
            System.out.println("Enter your choice: ");
            System.out.println("1. Run again: ");
            System.out.println("2. Exit.");
            choice = sc.nextInt();
            int rand_int = rand.nextInt(3);
            if (rand_int == 0) {
                Tablet t1 = new Tablet();
                t1.displayLabel();
            } else if (rand_int == 1) {
                Syrup s1 = new Syrup();
                s1.displayLabel();
            } else {
                Ointment o1 = new Ointment();
                o1.displayLabel();
            }
        }while(choice<2);
    }
}
