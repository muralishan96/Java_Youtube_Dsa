package YoutubeLearning;

public class dataStruct {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 1, 6, 7, 8, 9 };
        int n = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                n++;
            }
        }
        int[] ouArr = new int[n];
        int ouArrIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                ouArr[ouArrIndex] = arr[i];
                ouArrIndex++;
            }
        }
        for (int i = 0; i < ouArr.length; i++) {
            System.out.print(ouArr[i] + " ");
        }
    }
}
