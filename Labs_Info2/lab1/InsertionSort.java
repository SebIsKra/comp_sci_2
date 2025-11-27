public class InsertionSort{
    
    public static void sortString(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String val = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1].compareTo(val) > 0) {
                arr[j] = arr[j - 1];
                j--;
            }

            arr[j] = val;
        }

    }
}
