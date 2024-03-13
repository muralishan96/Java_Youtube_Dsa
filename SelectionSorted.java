package DemoJava;

public class SelectionSorted {
    public static void main(String[] args) {
        int nums[] = { 6, 2, 8, 4, 9, 0 };
        int temp = 0;
        int minIndex=0;
        System.out.println("Selection Sort");
        System.out.println("Before sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        for(int i=0;i<nums.length-1;i++){
            minIndex=i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[minIndex]>nums[j]){
                    minIndex=j;
                }
            }
            temp = nums[minIndex];
            nums[minIndex]=nums[i];
            nums[i]=temp;
        }
        System.out.println("After sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
    
}
