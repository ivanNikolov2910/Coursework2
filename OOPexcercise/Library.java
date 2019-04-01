package OOPexcercise;

import java.util.ArrayList;

public class Library {
    private String libraryName;
    private ArrayList<Books> list = new ArrayList<>();

    public Library(String libraryName) {
        this.libraryName = libraryName;
    }

    public void addBook(Books newBook) {
        this.list.add(newBook);
    }
    public void print(String author) {
        for (Books books : list) {
            if (author.equals(books.getAuthor())) {
                System.out.println(books.getTitle());
                System.out.println(books.getYear());
                System.out.println(books.getPublishingHouse());
                System.out.println(books.getIsbn());
            }
        }
        System.out.println();
    }
    public void print() {
        for (Books books : list) {
            System.out.println(books.getTitle());
            System.out.println(books.getAuthor());
            System.out.println(books.getYear());
            System.out.println(books.getPublishingHouse());
            System.out.println(books.getIsbn());
            System.out.println();

        }
        System.out.println();
        System.out.println();
    }
    public void delete(String author) {
        for (int i = 0; i < list.size(); i++) {
            if (author.equals(list.get(i).getAuthor())) {
                list.remove(i);
            }
        }
    }
}
