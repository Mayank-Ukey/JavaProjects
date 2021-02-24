// Assignment 3
public class Book {
    String book_title;
    String book_author;
    String book_publication;
    int book_price;

    public Book(){
        book_title = "NULL";
        book_author = "NULL";
        book_publication = "NULL";
        book_price = 0;
    }

    public Book(String title, String author, String publication, int price){
        this.book_title = title;
        this.book_author = author;
        this.book_publication = publication;
        this.book_price = price;
    }

    public String getBookTitle(){
        return book_title;
    }

    public void setBookTitle(String title){
        this.book_title = title;
    }

    public String getBookAuthor(){
        return book_author;
    }

    public void setBookAuthor(String author){
        this.book_author = author;
    }

    public String getBookPublication(){
        return book_publication;
    }

    public void setBookPublication(String publication){
        this.book_publication = publication;
    }

    public int getBookPrice(){
        return book_price;
    }

    public void setBookPrice(int price){
        book_price = price;
    }

    public static void main(){
        System.out.println("I am Mayank Ukey and I am the best in the world");
    }
}
