package DemoJava;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 5, 6, 2, 8, 3, 1 };
        System.out.println("Isertion Sort");
        System.out.println("Big O Notation : O(n2)");

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
