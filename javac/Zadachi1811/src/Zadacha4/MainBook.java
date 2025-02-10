package Zadacha4;

import java.io.*;

public class MainBook {
    public static void main(String[] args) {
        Book book1 = new Book("Maria and the cats","Ana");
        Book book2 = new Book("harry Potter","Rowling");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.txt"))) {
            oos.writeObject(book1);
            oos.writeObject(book2);
            System.out.println("Object serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.txt"))){
            Book book1Des = (Book) ois.readObject();
            Book book2Des = (Book) ois.readObject();
            book1Des.print();
            book2Des.print();
        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
