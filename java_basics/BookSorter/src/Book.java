import java.util.Date;

public class Book implements Comparable<Book> {
    private String name;
    private String author;
    private String publishedDate;
    private int page;


    public Book(String name, int page, String author, String publishedDate) {
        this.name = name;
        this.page = page;
        this.author = author;
        this.publishedDate = publishedDate;
    }

    public String getName() {
        return name;
    }

    public int getPage() {
        return page;
    }
    public String getAuthor() {
        return author;
    }
    public String  getPublishedDate() {
        return publishedDate;
    }

    @Override
    public int compareTo(Book o) {
        return this.name.compareTo(o.name);
    }
}
