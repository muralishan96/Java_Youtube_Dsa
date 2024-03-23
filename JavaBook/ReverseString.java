package JavaBook;

public class ReverseString {
    public static void main(String[] args) {
        String str = "murali";
        // StringBuffer a = new StringBuffer(str);
        // System.out.println(a.reverse());
        // a = a.reverse();
        // System.out.println(a);

        StringBuilder input1 = new StringBuilder();
        input1.append(str);
        System.out.println(input1);
        input1 = input1.reverse();
        System.out.println(input1);
        for (int i = 0; i < input1.length(); i++) {
            System.out.print(input1.charAt(i) + " ");
        }
    }
}
