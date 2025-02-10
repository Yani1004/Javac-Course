public class Zad16 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,489,55};
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int[] newArr = new int[arr.length-1];
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != max){
                newArr[index++] = arr[i];
            }
        }
        int secondMax = newArr[0];
        for(int i = 1; i < newArr.length; i++){
            if(newArr[i] > secondMax){
                secondMax = newArr[i];
            }
        }
        System.out.printf("The second max is %d\n", secondMax);
    }
}
