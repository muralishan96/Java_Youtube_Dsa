package JavaBook;

import java.util.Scanner;

public class Str1 {
    public static void main(String[] args) {
        System.out.println("hi");
        Scanner sc = new Scanner(System.in); // System.in is a standard input stream
        System.out.print("Enter a string: ");
        String str = sc.nextLine(); // reads string
        System.out.print("You have entered: " + str);
    }
}
