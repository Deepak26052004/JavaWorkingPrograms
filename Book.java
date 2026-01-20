import java.util.*;
public class Book {
    int id;
    String title;
    String price;
    static String author="Deepak";
    public static void main(String[] args) {
        Book a=new Book();
        a.title="Once Upon A Time";
        a.id=1;
        a.price="$3000";
        System.out.println("Book Author Name: "+author);
        System.out.println("Title: "+a.title);
        System.out.println("Book Id: "+a.id);
        System.out.println("Book Price: "+a.author);
        a.read();
        a.write();
        a.study();


    }
    public void read(){
        System.out.println("Reading");
    }
    public void write(){
        System.out.println("Writing");
    }
    public void study(){
        System.out.println("Studying");
    }
}
