package DemoJava.YoutubeDsa;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = { 8, 4, 3, 2, 7, 8, 9 };
        int start = 0;
        int end = arr.length - 1;
        printArray(arr);
        reverseA(arr, start, end);
        System.err.println();
        printArray(arr);

    }

    public static void reverseA(int[] arrya, int start, int end) {
        while (start < end) {
            int temp = arrya[start];
            arrya[start] = arrya[end];
            arrya[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.err.print(array[i] + " ");
        }
    }
}
