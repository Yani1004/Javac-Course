public class Zad12 {
    public static void main(String[] args) {
        String[] dumi = {"apple", "banana","apple", "kiwi", "mango","mango"};
        for(int i = 0; i < dumi.length; i++){
            for(int j = i+1; j < dumi.length; j++){
                if(dumi[i].equals(dumi[j])){
                    System.out.printf("Yes '%s' is repeating\n", dumi[i]);
                }
            }
        }

    }
}
