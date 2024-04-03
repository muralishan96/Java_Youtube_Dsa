package W3School.File;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try{
            FileWriter myWriter = new FileWriter("C:\\Users\\Murali\\Downloads\\Java\\DemoJava\\W3School\\File\\Murali.txt");
            myWriter.write("File in java might be trcky, but it is fun enough!");
            myWriter.close();
            System.out.println("Succfully wrote to the file ");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
