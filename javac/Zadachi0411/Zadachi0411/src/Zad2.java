import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            System.out.println("Type in num: ");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        int average = 0;
        for(int i = 0; i < arr.length; i++){
            average+=arr[i];
        }
        average/=arr.length;
        System.out.println("Average: "+average);
    }
}
