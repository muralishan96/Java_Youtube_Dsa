package Oreilly;

public class StringConsept {
    public static void main(String[] args) {
        //Same string store in same object 
        //String is an object  //String Literal
        String s = "Hello Murali";
        String s1 = "Hello Murali";

        if (s == s1){
            System.out.println("Same memmory");
        }


        //every time new object creation   //String object
        String s2 = new String("Welcome");
        String s3 = new String("Welcome");
        if(s2 == s3){
            System.out.println("same memory");
        }else if (s2.equals(s3)){
            System.out.println("same value ");
        }else{
            System.out.println("Nothing");
        }


        String splitStr = "Hello Murrali how are";
        String[] a = splitStr.split("how");
        System.out.println(a[0]);
        System.err.println(a[1]);
        System.err.println(a[1].trim());

        for(int i =0;i<splitStr.length();i++){
            System.out.println(splitStr.charAt(i));
        }

        for(int i =splitStr.length()-1;i>=0;i--){
            System.out.println(splitStr.charAt(i));
        }
    }
}
