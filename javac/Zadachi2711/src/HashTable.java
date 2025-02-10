import java.util.LinkedList;

public class HashTable {
    private static class Entry {
        String key;
        Kniga book;

        Entry(String key, Kniga book) {
            this.key = key;
            this.book = book;
        }
    }

    private LinkedList<Entry>[] books;

    public HashTable() {
        books = new LinkedList[10];
        for (int i = 0; i < books.length; i++) {
            books[i] = new LinkedList<>();
        }
    }

    private int hash(String key) {
        int hash = 0;
        for (char c : key.toCharArray()) {
            hash += c;
        }
        return hash % books.length;
    }


    public void add(String isbn, String title) {
        int index = hash(isbn);
        LinkedList<Entry> bucket = books[index];

        for (Entry entry : bucket) {
            if (entry.key.equals(isbn)) {
                entry.book = new Kniga(title);
                return;
            }
        }

        bucket.add(new Entry(isbn, new Kniga(title)));
    }


    public Kniga get(String isbn) {
        int index = hash(isbn);
        LinkedList<Entry> bucket = books[index];

        for (Entry entry : bucket) {
            if (entry.key.equals(isbn)) {
                return entry.book;
            }
        }

        return null;
    }


    public void printCatalog() {
        for (int i = 0; i < books.length; i++) {
            System.out.print("Номер " + i + ": ");
            for (Entry entry : books[i]) {
                System.out.print("[" + entry.key + " -> " + entry.book + "] ");
            }
            System.out.println();
        }
    }
}
