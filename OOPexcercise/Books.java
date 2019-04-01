package OOPexcercise;

public class Books {
    private String title;
    private String author;
    private String publishingHouse;
    private int year;
    private String isbn;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public int getYear() {
        return year;
    }

    public String getIsbn() {
        return isbn;
    }

    public Books(String title, String author, String publishingHouse, int year, String isbn) {
        this.title = title;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.isbn = isbn;
    }
}
