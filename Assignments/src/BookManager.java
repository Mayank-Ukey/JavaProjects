// Assignment 3

import java.util.Scanner;
public class BookManager {
    int size;
    Book bookObjects[] = new Book[size];
    public void createBooks(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number of book objects you wanna create: ");
        size = sc.nextInt();

        for (int i=0; i<size; i++){
            String title, author, publication;
            int price;
            System.out.println("Enter title of book: ");
            title = sc.next();
            System.out.println("Enter author of book: ");
            author = sc.next();
            System.out.println("Enter book publication: ");
            publication = sc.next();
            System.out.println("Enter book price: ");
            price = sc.nextInt();
            bookObjects[i] = new Book(title, author, publication, price);
        }
    }

    public void showBooks(){
        System.out.println("Book Title     Price");
        for (int i=0; i<size; i++){
            System.out.println(bookObjects[i].getBookTitle()+"     "+bookObjects[i].getBookPrice());
        }
    }

    public void main(String[] args) {
        createBooks();
        showBooks();
    }
}
