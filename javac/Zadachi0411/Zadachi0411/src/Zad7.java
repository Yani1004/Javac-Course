public class Zad7 {
    public static void main(String[] args) {
        int[] arr = {12,-5,67,-456,79,-22,424,45,3,7,9,6};
        int numPlus = 0;
        int numMinus = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]> 0){
                numPlus++;
            }else{
                numMinus++;
            }
        }
        System.out.printf("The positive numbers are %d\n",numPlus);
        System.out.printf("The negative numbers are %d",numMinus);
    }
}
