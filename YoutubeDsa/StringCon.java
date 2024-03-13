package DemoJava.YoutubeDsa;

import java.util.Scanner;

public class StringCon {
    public static void main(String[] args) {
        System.out.println("String Concatination");
        String s1 = "Hello";
        String s2 = "World", s3 = s1 + " " + s2;
        System.out.println(s3);

        StringBuffer sd = new StringBuffer("Hello");
        sd.append(" ");
        sd.append("world");
        System.out.println(sd);

        StringBuffer s = new StringBuffer("Hello")
                .append(" ")
                .append("world");
        System.out.println(s);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value");
        String input = sc.nextLine();
        System.out.println(input);
    }
}
