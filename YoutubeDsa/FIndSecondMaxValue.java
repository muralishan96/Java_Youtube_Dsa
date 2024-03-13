package DemoJava.YoutubeDsa;

public class FIndSecondMaxValue {
    public static void main(String[] args) {
        int[] numbers = { 33, 44, 22, 4, 66, 66, 56, 74, 74, 100 };
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        System.out.println(max);
        System.out.println(secondMax);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                secondMax = max;
                max = numbers[i];

            } else if (numbers[i] > secondMax && numbers[i] != max) {
                secondMax = numbers[i];
            }
        }

        System.out.println(max);
        System.out.println(secondMax);
    }
}
