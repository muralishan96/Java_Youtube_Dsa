package JavaBook;

public class LargestValue {
    public static void main(String[] args) {
        int[] val = { 1, 2, 4, 2, 2, 5, 6, 44, 55 };

        int large = val[0];
        for (int i = 1; i < val.length; i++) {
            if (val[i] > large) {
                large = val[i];
            }
        }
        System.out.println(large);
    }
}
