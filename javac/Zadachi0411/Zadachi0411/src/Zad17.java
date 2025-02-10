public class Zad17 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        int[] array2 = {7, 8, 9, 4, 5, 1};
        int[] obedinenie = new int[array1.length + array2.length];
        int currentIndex = 0;

        for (int element : array1) {
            obedinenie[currentIndex++] = element;
        }

        for (int element : array2) {
            boolean foundInFirstArray = false;
            for (int value : array1) {
                if (element == value) {
                    foundInFirstArray = true;
                    break;
                }
            }
            if (!foundInFirstArray) {
                obedinenie[currentIndex++] = element;
            }
        }

        System.out.print("Union (Обединение): ");
        for (int i = 0; i < currentIndex; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (obedinenie[i] == obedinenie[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.print(obedinenie[i] + " ");
            }
        }

        int counter = 0;
        for(int i = 0; i < array1.length; i++){
            for(int j = 0; j < array2.length; j++){
                if(array1[i] == array2[j]){
                    counter++;
                }
            }
        }
        int[] suedinenie = new int[counter];
        int index = 0;
        for(int i = 0; i < array1.length; i++){
            for(int j = 0; j < array2.length; j++){
                if(array1[i] == array2[j]){
                   suedinenie[index++] = array1[i];
                }
            }
        }
    }
}
