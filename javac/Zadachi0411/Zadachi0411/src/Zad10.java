public class Zad10 {
    public static void main(String[] args) {
        int[] arr = {1,2,1,23,1,5,6};
        int numToDelete = 1;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != numToDelete) {
                count++;
            }
        }
        int index = 0;
        int[] newArr = new int[count];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != numToDelete){
                newArr[index] = arr[i];
                index++;
            }
        }
        System.out.println(newArr.toString());
    }
}
