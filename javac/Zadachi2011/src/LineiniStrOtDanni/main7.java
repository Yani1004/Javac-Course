package LineiniStrOtDanni;

import java.util.Arrays;

public class main7 {
    public static void main(String[] args) {
        DocumentHashTable docs = new DocumentHashTable();
        docs.addDocument(1, Arrays.asList("ООП", "Програмиране"));
        docs.addDocument(2, Arrays.asList("Алгоритми", "Програмиране"));
        docs.addDocument(3, Arrays.asList("ООП", "Дизайн"));

        System.out.println(docs.searchDocuments("ООП"));          // [1, 3]
        System.out.println(docs.searchDocuments("Програмиране")); // [1, 2]
        System.out.println(docs.searchDocuments("Данни"));
    }
}
