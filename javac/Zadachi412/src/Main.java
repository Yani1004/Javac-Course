import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    private static final String FileName;
    private static final Object mutex;
    static{
        FileName = "file.txt";
        mutex = new Object();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Runnable r1 = ()->{
            BufferedWriter bw = null;
            try{
                while(true){
                    String line = sc.nextLine();
                    synchronized(mutex) {
                        bw = new BufferedWriter(new FileWriter(FileName,true));
                        System.out.println("Type in text to write in file: ");
                        bw.write(line+"\n");
                        bw.flush();
                    }



                }
            }catch (Exception e){
                e.printStackTrace();
            }
        };
        Runnable r2 = ()->{
            BufferedReader br = null;
            try {
                while(true){
                    synchronized(mutex) {
                        br = new BufferedReader(new FileReader(FileName));
                        String line = null;
                        while((line = br.readLine()) != null){
                            System.out.println("Text from file: ");
                            System.out.println(line+"\n");
                            br.close();
                            Thread.sleep(5000);
                        }

                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }

}