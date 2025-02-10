public class Main {
    public static void main(String[] args) {
        String str = "2*Levski*CSK*Arena Armeec*16.09.2015*22:00*2000*25*";
        String[] strArr = str.split("\\*");
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i] + " " + i);

        }
    }
}