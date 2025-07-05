public class Book {
    private String title;
    private int pages;
    private String author;
    private int publishedYear;

    public Book(String title, int pages, String author, int publishedYear) {
        this.title = title;
        this.pages = pages;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublishedYear() {
        return publishedYear;
    }
}
