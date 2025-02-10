package Zadacha9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CvsFile {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("cvs.txt"));
            String regex = "[А-я][а-я]+,[1-9]+,[А-я][а-я]+";
            String line;
            int totalAge = 0;
            int count = 0;
            Pattern p = Pattern.compile(regex);
            Matcher m;
            String[] towns=null;
            while ((line = bufferedReader.readLine()) != null) {
                m = p.matcher(line);
                while (m.find()) {
                    String match = m.group();
                    String[] data = match.split(",");
                    towns = new String[data.length];
                    int age = Integer.parseInt(data[1]);
                    String city = data[2];
                    totalAge += age;
                    towns[count]=city;
                    count++;
                }
            }

            double averageAge = (double) totalAge / count;
            System.out.printf("Average Age: %.0f",averageAge);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(bufferedReader != null){
                    bufferedReader.close();
                }
            }catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

}
