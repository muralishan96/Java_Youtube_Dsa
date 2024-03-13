package DemoJava.YoutubeDsa;

public class zeroMoveEnd {
    // https://www.youtube.com/watch?v=2ZLl8GAk1X4&list=PPSV
    public void printArray(int[] ara) {
        for (int i = 0; i < ara.length; i++) {
            System.err.print(ara[i] + " ");
        }
        System.out.println();
    }

    public void moveZero(int[] numberArr) {
        int j = 0;
        for (int i = 0; i < numberArr.length; i++) {
            if (numberArr[i] != 0 && numberArr[j] == 0) {
                int temp = numberArr[i];
                numberArr[i] = numberArr[j];
                numberArr[j] = temp;
            }
            if (numberArr[j] != 0) {
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = { 10, 3, 4, 2, 0, 3, 5, 0 };
        zeroMoveEnd obj = new zeroMoveEnd();
        obj.printArray(numbers);
        obj.moveZero(numbers);
        obj.printArray(numbers);
    }
}
