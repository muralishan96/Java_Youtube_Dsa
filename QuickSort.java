package DemoJava;

public class QuickSort {

    public static void quicksorta(int[] arr,int low,int high){
        if(low<high){
            int pi = partition(arr, low, high);
            quicksorta(arr, low, pi - 1);
            quicksorta(arr, pi + 1,high);
        }
    }
    private static int partition(int[] arr,int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int t = arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
        int t = arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=t;
        return i+1;
    }
    public static void main(String[] args) {
        int arr[]={4,2,66,33,22};

        int low=0;
        quicksorta(arr,low=0,arr.length-1);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
