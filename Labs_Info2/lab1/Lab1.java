import java.util.Arrays;

public class Lab1 {
    // Fields (class variables)
    public static int[] testArray = {2, 5, 4, 7, 9, 8};
    public static int[] testArray2 = {2, 6, 4, 7, 9, 8, 10};
    public static int[] testArray3 = {2, 5, 4, 7, 9, 8, 1};

    // Main Method
    public static void main(String[] args) {
        exercise1_1(testArray);
        exercise1_2(testArray2);
        exercise1_2(testArray3);

    }

    // Class Method
    public static int[] exercise1_1(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int val = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > val) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = val;
        }

        //Outputting array to see if the sorting-algorithm worked
        System.out.println(Arrays.toString(arr));

        return arr;
    }

    public static int exercise1_2(int[] arr)
    {
        exercise1_1(arr);
        int median;
        if(arr.length % 2 != 0){
            median = arr[(arr.length-1)/2];
        }else{
            median = arr[(arr.length/2) + (arr.length/2 - 1)];
        }
        //Print median to test if it works
        System.out.println(median);
        return median;
    }

}
