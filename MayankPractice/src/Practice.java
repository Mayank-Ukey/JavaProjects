import java.util.Scanner;

class Library{
    String[] availableBooks;
    String[] issuedBooks;
    static int i=0;
    static int j=0;
    Library(int numBooks){
        availableBooks = new String[numBooks];
        issuedBooks = new String[numBooks];
    }

    public void addBook(String book){
        if(i==availableBooks.length){
            System.out.println("Can't add more books.");
        }
        else{
            availableBooks[i] = book;
            i++;
        }
    }

    public int issueBook(){
        Scanner sc  = new Scanner(System.in);
        if(j==issuedBooks.length-1){
            System.out.println("You can't issue more books.");
        }
        else{
            String name;
            System.out.println("Enter the name of book you wanna issue: ");
            name = sc.next();
            for (String val:availableBooks){
                int k=0;
                if(name.equals(val)){
                    for (int x=k; x<availableBooks.length-1; x++){
                        availableBooks[x] = availableBooks[x+1];
                    }
                    i--;
                    issuedBooks[j] = name;
                    j++;
                    return 1;
                }
                else{
                    k++;
                }
            }
        }
        return 0;
    }

    public void returnBook(){
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("Enter the name of the book, you wanna return: ");
        name = sc.next();
        availableBooks[i] = name;
        i++;
    }

    public void showAvailableBooks(){
        int m=0;
        while(m<i){
            System.out.println(availableBooks[m]+" ");
            m++;
        }
    }
}

public class Practice {
    public static void main(String[] args) {
        // Implement a library using Java class library
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books
        // and an array to store the issue books.
        Scanner sc = new Scanner(System.in);
        int numBooks;
        System.out.println("Enter the number of books, you want to make available.");
        numBooks = sc.nextInt();

        Library l = new Library(numBooks);
        int choice;
        do {
            System.out.println("Enter your choice: ");
            System.out.println("1. Add Book: ");
            System.out.println("2. Issue Book: ");
            System.out.println("3. Return Book: ");
            System.out.println("4. Show Available Books: ");
            System.out.println("5. Exit");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    String name;
                    System.out.println("Enter the book name you want to add: ");
                    name = sc.next();
                    l.addBook(name);
                    System.out.println("Book Added.");
                    break;

                case 2:
                    int res = l.issueBook();
                    if(res==1){
                        System.out.println("Book issued.");
                    }
                    else{
                        System.out.println("Book is not issued.");
                    }
                    break;

                case 3:
                    l.returnBook();
                    break;

                case 4:
                    l.showAvailableBooks();
            }
        }while(choice<5);
        System.out.println("You are out of the program.");
    }
}