import java.util.Comparator;

public class BookPageComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return Integer.compare(o2.getPage(),o1.getPage());
    }
}
