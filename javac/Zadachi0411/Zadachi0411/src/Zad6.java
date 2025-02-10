public class Zad6 {
    public static int findNum(int[] numbers, int num) {
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == num){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] numbers = {5,8,9,125,56,567,5,4};
        if(findNum(numbers, 4) == -1){
            System.out.println("Not found");
        }else{
            System.out.printf("The number is at position %d\n", findNum(numbers, 4));
        }
    }
}
