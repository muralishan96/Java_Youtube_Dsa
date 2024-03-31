package W3School;

public class Recurtion {
    public static void main(String[] args) {
        int result = sum(5);
        System.out.println(result);
        int sub = sub(5);
        System.out.println("Sub "+sub);
      }
      public static int sum(int k) {
        if (k > 0) {
            System.out.println("k "+k);
          return k + sum(k - 1);
        } else {
          return 0;
        }        
      }
      public static int sub(int k ){
        if(0<k){
            System.out.println("k "+k);
            return k - sub(k-1);
        }else{
            return 0;
        }
    }
}
