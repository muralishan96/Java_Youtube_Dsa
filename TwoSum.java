package DemoJava;
public class TwoSum {

   public static void main(String[] args) {
    int a[]={2,5,5,11};
   int target = 10;
    // int a[]={3,2,4};
    // int target=6;
    
    for(int i =0;i<a.length-1;i++){
        for(int j=i+1;j<a.length;j++){
            if((a[i]+a[j]) == target){
                System.out.println("a["+i+","+j+"]");
            }
        }
    }
   }
}
