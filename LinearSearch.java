package DemoJava;

public class LinearSearch {
    public static void main(String[] args) {
        int target = 55;
        int nums[]= {3,8,12,16,55,221};
        int first=0,last=nums.length-1;
        int result = LinearSearchFuntion(nums, target);
        System.out.println("Hello chuchu: This one Linear Search");
        if(result!=-1){
            System.out.println("Value "+target+" Found in given sorted array");
        }else{
            System.out.println("Value "+target+" not Found in given sorted array");
        }

        
        int result1 = BinarySearchFuntion(nums, target,first,last);
        System.out.println("Hello chuchu: This one Binary Search");
        if(result1!=-1){
            System.out.println("Value "+target+" Found in given sorted array");
        }else{
            System.out.println("Value "+target+" not Found in given sorted array");
        }
    }
    public static int LinearSearchFuntion(int nums[],int target){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==target){
                return 1;
            }            
        }
        return -1;
    }
    public static int BinarySearchFuntion(int nums[],int target,int first,int last){
        
        for(int i=0;i<nums.length;i++){
            int mid = (first+last)/2;
            if(nums[mid]==target){
                return 1;
            }else if(nums[mid]<target){
                first=mid+1;
            }else{
                last=mid - 1;
            }
        }
        return -1;

    }
}
