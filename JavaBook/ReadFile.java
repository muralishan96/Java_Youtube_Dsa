package JavaBook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        BufferedReader reader;
        try{
            reader = new BufferedReader(new FileReader("C:\\Users\\Murali\\Downloads\\Java\\DemoJava\\YoutubeDsa\\Hint.txt"));
            String line = reader.readLine();
            while (line!=null) {
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        try{
            Scanner scanner = new Scanner(new File("C:\\Users\\Murali\\Downloads\\Java\\DemoJava\\YoutubeDsa\\Hint.txt"));
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
