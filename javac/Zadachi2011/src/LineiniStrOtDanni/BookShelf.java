package LineiniStrOtDanni;

import java.util.LinkedList;
import java.util.Queue;

public class BookShelf {
    private Queue<String> books;
    public BookShelf() {
        books = new LinkedList<String>();
    }

    public void addBook(String book) {
        books.add(book);
        System.out.printf("Added: %s\n", book);
    }
    public void takeBook() {
        if (books.isEmpty()) {
            System.out.println("Empty Book Shelf");
        }else{
            String takenBook = books.poll();
            System.out.printf("Taken: %s\n", takenBook);
        }
    }
}
