package Interview;

public class StringConcat {
    public static void main(String[] args) {
        String str1 = "asd",str2 = "ass",str3 = "ser";
        String s = str1.concat(str2.concat(str3));
        System.out.println(s);
        System.out.println(str1+str2+str3);
        String s2= str1.concat(str2).concat(str3);
        System.out.println(s2);
    }
}
