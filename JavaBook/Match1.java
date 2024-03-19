package JavaBook;

public class Match1 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x < 5) {
            // y = x - y; - 5
            y = y + x;
            System.err.print(x + "" + y + " ");
            x = x + 1;
        }
    }
}
