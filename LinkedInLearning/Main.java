package LinkedInLearning;

public class Main {
    public static void main(String[] args) {
        // System.out.println(args[0]);

        byte b =1;
        short sh = 1; 
        int i =1;
        long a = 1L;
         float f = 1f;
         double d = 1d;

         System.out.println("Byte "+b);
         System.out.println("Short "+sh);
         System.out.println("Int "+i);
         System.out.println("Long "+a);
         System.out.println("float "+f);
         System.out.println("Double %.2f "+d);
         System.err.println(String.format("%.6f", f));
    }
}
