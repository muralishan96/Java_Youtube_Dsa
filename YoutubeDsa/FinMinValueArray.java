package DemoJava.YoutubeDsa;

public class FinMinValueArray {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 5, 7, 2, 9, 1 };
        FinMinValueArray obj = new FinMinValueArray();
        int minVal = obj.minimumValueFind(arr);
        System.out.println("Minimum value of given array " + minVal);

    }

    public int minimumValueFind(int[] aInt) {
        if (aInt == null || aInt.length == 0) {
            throw new IllegalArgumentException("Invalid Input");
        }
        int min = aInt[0];
        for (int i = 0; i < aInt.length; i++) {
            if (min > aInt[i]) {
                min = aInt[i];
            }
        }
        return min;
    }
}
