package DemoJava.YoutubeDsa;

public class findMissingNumber {
    public static void main(String[] args) {
        int[] number = { 2, 4, 5, 1, 3, 7 };
        int l = number.length + 1;
        int n = (l * (l + 1)) / 2;
        System.out.println("n " + n);
        for (int i = 0; i < number.length; i++) {
            n -= number[i];
        }
        System.out.println("Missing " + n);
    }
}
