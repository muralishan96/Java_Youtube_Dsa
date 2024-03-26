package HackerRank;

import java.util.Scanner;

public class StrinEx1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next(); //hello
        String B=sc.next(); //world
        /* Enter your code here. Print output to STDOUT. */
        
        System.out.println(A.length()+B.length());
        
        System.out.println(A.compareTo(B)>0 ? "Yes" : "No");
        // System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        
        String A1 = A.substring(0,1).toUpperCase();
        String A2 = A.substring(1);
        String A3 = A1+A2;
        String B1 = B.substring(0,1).toUpperCase();
        String B2 = B.substring(1);
        String B3 = B1+B2;
        
        System.out.println(A3+" "+B3);
    }
}
