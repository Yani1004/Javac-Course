public class Zad14 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,3,2,1};//8
        /////////////0 1 2 3 4 5 6 7
        int isPalindrom = 1;
        for(int i = 0; i<arr.length; i++){
            for(int j = arr.length-1; j>arr.length; j--){
                if(arr[i]!= arr[j]){
                    isPalindrom = 0;
                }
                }

                if(isPalindrom == 0){
                    break;
            }
        }
        if(isPalindrom == 1){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
