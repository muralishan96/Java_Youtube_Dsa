package LinkedInLearning;

public class byteLearn {
    public static void main(String[] args) {
        byte a = 126;
        System.out.println("byte "+a);

        if (a<Byte.MAX_VALUE) {
            a++;            
        }
        System.out.println("byte "+a);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
    }
}
