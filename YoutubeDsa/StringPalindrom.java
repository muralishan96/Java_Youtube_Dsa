package DemoJava.YoutubeDsa;

public class StringPalindrom {
    public static void main(String[] args) {
        String name = "madam";
        StringPalindrom obj = new StringPalindrom();
        boolean result = obj.polindrome(name);
        if (result) {
            System.err.println("given sting is polindrome");
        } else {
            System.err.println("given sting is not polindrome");

        }

    }

    public boolean polindrome(String str) {
        char[] stringPaly = str.toCharArray();
        int start = 0;
        int end = stringPaly.length - 1;
        while (stringPaly[start] != stringPaly[end]) {
            return false;
        }
        start++;
        end--;
        return true;
    }
}
