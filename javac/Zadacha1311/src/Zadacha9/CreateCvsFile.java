package Zadacha9;
import java.io.File;
import java.io.IOException;
public class CreateCvsFile {
    public static void main( String[] args ){
        try {
            File file = new File("cvs.txt");
            boolean isCreated = file.createNewFile();
            if (isCreated){
                System.out.println("File has been created successfully");
            }
            else{
                System.out.println("File already present at the specified location");
            }
        } catch (IOException e) {
            System.out.println("Exception Occurred:");
            e.printStackTrace();
        }
    }
}
