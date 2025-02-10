public class Main {
    public static void main(String[] args) {
        HashTable bookCatalog = new HashTable();


        bookCatalog.add("978-3-16-148410-0", "Примерна книга");
        bookCatalog.add("978-0-12-345678-9", "Друга книга");
        bookCatalog.add("978-1-61-729223-1", "Книга за Java");


        System.out.println("Книга с ISBN 978-3-16-148410-0: " + bookCatalog.get("978-3-16-148410-0"));


        System.out.println("Каталог на книги:");
        bookCatalog.printCatalog();
    }
}
