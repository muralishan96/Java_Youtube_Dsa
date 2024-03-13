package DemoJava;

public class Bubblesort {
    public static void main(String[] args) {
        int nums[] = { 6, 2, 8, 4, 9, 0 };
        int temp = 0;
        System.out.println("Bubbule Sort ");
        System.out.println("Before sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        for (int j = 0; j < nums.length; j++) {

            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }
            System.out.println("j "+j);
            for (int num : nums) {
                System.out.print(num + " ");
            }
        }

        System.out.println();
        System.out.println("After sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

}
