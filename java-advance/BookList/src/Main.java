import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("1984", 328, "George Orwell", 1949));
        books.add(new Book("To Kill a Mockingbird", 281, "Harper Lee", 1960));
        books.add(new Book("The Great Gatsby", 180, "F. Scott Fitzgerald", 1925));
        books.add(new Book("Cleaver", 320, "Margaret Atwood", 1985));
        books.add(new Book("The Catcher in the Rye", 277, "J.D. Salinger", 1951));
        books.add(new Book("Brave New World", 311, "Aldous Huxley", 1932));
        books.add(new Book("Fahrenheit 451", 158, "Ray Bradbury", 1953));
        books.add(new Book("The Hobbit", 310, "J.R.R. Tolkien", 1937));
        books.add(new Book("Harry Potter and the Sorcerer's Stone", 309, "J.K. Rowling", 1997));
        books.add(new Book("The Lord of the Rings", 1178, "J.R.R. Tolkien", 1954));

        Map<String, String> bookDetails = books.stream()
                .collect(Collectors.toMap(
                        book -> book.getAuthor(),
                        book -> book.getTitle(),
                        (title1, title2) -> title1 + ", " + title2  // Merge titles if authors are the same
                ));

        System.out.println("Book Details");
        bookDetails.forEach((author, title) -> {
            System.out.println(author + " => " + title);
        });

        System.out.println("================================");
        System.out.println("Books with more than 100 pages:");
        List<Book> filteredBook = books.stream()
                .sorted((b1, b2) -> Integer.compare(b1.getPages(), b2.getPages()))
                .filter(book -> book.getPages() > 100)
                .toList();

        filteredBook.forEach(book -> {
            System.out.println(book.getTitle() + " - " + book.getAuthor() + " - " + book.getPublishedYear() + " - " + book.getPages());
        });
    }
}