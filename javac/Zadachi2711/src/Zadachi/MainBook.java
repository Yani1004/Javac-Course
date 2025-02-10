package Zadachi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainBook {
    public static void main(String[] args) {
        List<Book> books= Arrays.asList(
                new Book("Hobbit",1963, Book.Genre.FICTION),
                new Book("Zootopia",2001, Book.Genre.DRAMA),
                new Book("It",1983,Book.Genre.HORROR),
                new Book("Me before you",2008, Book.Genre.ROMANCE),
                new Book("Me before you",2008, Book.Genre.ROMANCE),
                new Book("Alice in wonderland",2008, Book.Genre.ROMANCE));
        System.out.println("ALl of the books: ");
        books.forEach(book -> System.out.println(book.toString()));

        System.out.println("\nSorted books by year: ");
        books.stream().sorted((b1,b2)->b1.getYearOfPublication()-b2.getYearOfPublication()).forEach(book -> System.out.println(book.toString()));

        System.out.println("\nSorted books by title: ");
        books.stream().sorted((b1,b2)->b2.getTitle().compareTo(b1.getTitle())).forEach(book -> System.out.println(book.toString()));

        System.out.println("\nList with just titles:");
        List<String> titles = books.stream().map(Book::getTitle).distinct().sorted().toList();
        titles.forEach(System.out::println);


        System.out.println("\nGrouped by genre: ");
        books.stream().collect(Collectors.groupingBy(Book::getGenre))
                .forEach((genre, groupedBooks) -> {System.out.println(genre + ": ");
                groupedBooks.stream().map(Book::getTitle).distinct().forEach(System.out::println);
                });

    }
}
