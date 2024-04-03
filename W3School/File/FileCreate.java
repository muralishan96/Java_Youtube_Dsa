package W3School.File;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {
        try{
            File myObj = new File("C:\\Users\\Murali\\Downloads\\Java\\DemoJava\\W3School\\File\\Murali.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created "+myObj.getName());
            }else{
                System.out.println("File aleady exists.");
            }

        }catch(IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
