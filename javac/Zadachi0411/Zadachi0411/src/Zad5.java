import java.util.Arrays;

public class Zad5 {
    public static void main(String[] args) {
        String[] strings = {"Cat", "bear", "fox", "jaguar", "dog"};

        Arrays.sort(strings, (a, b) -> Integer.compare(a.length(), b.length()));

        for (String str : strings) {
            System.out.println(str);
        }
    }
}
