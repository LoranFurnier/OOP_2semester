import java.lang.*;
public class Library {
    public static void main(String[] args) {
        Book d1 = new Book("D. Dontsova", 250);
        Book d2 = new Book("V. Pelevin", 800);
        Book d3 = new Book("F. Dostoevsky");
        d3.setPages(600);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);        
    }
}