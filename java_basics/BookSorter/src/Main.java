import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Book> books1 = new TreeSet<>();
        Set<Book> books2 = new TreeSet<>(new BookPageComparator());

        books1.add(new Book("Java", 100, "Herbert Schildt", "05.11.2020"));
        books1.add(new Book("C++", 200, "Bjarne Stroustrup", "05.11.2020"));
        books1.add(new Book("Python", 300, "Mark Lutz", "05.11.2020"));
        books1.add(new Book("C#", 400, "Joshua Bloch", "05.11.2020"));
        books1.add(new Book("JavaScript", 500, "Douglas Crockford", "05.11.2020"));

        books2.add(new Book("Java for beginners", 100, "Herbert Schildt", "05.11.2020"));
        books2.add(new Book("C++ advance", 200, "Bjarne Stroustrup", "05.11.2020"));
        books2.add(new Book("Python for beginners", 300, "Mark Lutz", "05.11.2020"));
        books2.add(new Book("C# for beginners", 400, "Joshua Bloch", "05.11.2020"));
        books2.add(new Book("JavaScript for beginners", 500, "Douglas Crockford", "05.11.2020"));

        System.out.println("Sort by name : ");
        for (Book book : books1) {
            System.out.println(book.getName() + " : " + book.getPage());
        }

        System.out.println("=============================");
        System.out.println("Sort by page : ");
        for (Book book : books2) {
            System.out.println(book.getName() + " : " + book.getPage());
        }

    }
}
