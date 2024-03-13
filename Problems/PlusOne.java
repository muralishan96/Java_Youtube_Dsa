package DemoJava.Problems;

public class PlusOne {
    public static void main(String[] args) {
       int digits[] = {9};
       int lastElement = digits.length-1;
       //output = {1.2.4}
        int op = 0;
       if((1 <= digits.length) && (digits.length<=100)){
            // op = digits[lastElement];
            digits[lastElement] = digits[lastElement]+1;
            // op=op+1;
            // digits[lastElement] = op;
            for(int i=0;i<digits.length;i++){
                System.out.print(digits[i]);
            }
       }
    }
}
