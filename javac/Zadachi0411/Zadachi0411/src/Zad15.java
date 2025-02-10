public class Zad15 {
    public static void main(String[] args) {
        int[] arr =  {1,2,3,4,5};
                    //0 1 2 3 4
        int mover = 2;
        mover %=arr.length;
        int[] rotated = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            rotated[(i+mover)%arr.length] = arr[i];
        }
        for (int num : rotated) {
            System.out.print(num + " ");
        }

    }
}
