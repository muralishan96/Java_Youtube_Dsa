package DemoJava.YoutubeDsa;

public class resizeArray {
    public void printArray(int[] printingArray) {
        for (int i = 0; i < printingArray.length; i++) {
            System.out.print(printingArray[i] + " ");
        }
        System.out.println();
    }

    public int[] reSize(int[] ar1, int capsity) {
        int[] temp = new int[capsity];
        for (int i = 0; i < ar1.length; i++) {
            temp[i] = ar1[i];
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] number = { 2, 3, 4, 2 };
        resizeArray obj = new resizeArray();
        obj.printArray(number);
        System.out.println(" length of the array " + number.length);
        int[] temp1 = obj.reSize(number, number.length * 2);
        obj.printArray(number);
        System.out.println(" length of the array " + temp1.length);
    }
}
