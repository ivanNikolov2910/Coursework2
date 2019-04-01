package OOPexcercise;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cmd = scanner.nextLine();
        Library library = new Library("Sun");
        Books book1 = new Books("IT", "Stivan King", "NotIT", 1997, "34-425-756-1527");
        Books book2 = new Books("The selfish gen", "Richard Dalkins", "NotIT", 1997, "34-425-756-1527");
        Books book3 = new Books("ITIT", "Stivan King", "NotIT", 1997, "34-425-756-1527");
        Books book4 = new Books("Bulgar", "Nedecho Bogdanov", "NotIT", 1997, "34-425-756-1527");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        library.print();
        library.delete("Stivan King");
        library.print();


    }
}
