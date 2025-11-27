
public class Lottery {
    private static int[] x = {3, 9, 1, 6, 38, 40};
    private static int[] y = {5, 8, 3, 7, 10, 1};
    private static Lottery lot = new Lottery();

    public static void main(String[] args) {
        lot.countRight(x, y);

        //Sorting-algorithm then using the other count function
        int[] sorted_x = lot.insertionSort(x);
        int[] sorted_y =lot.insertionSort(y);
        lot.fastCountRight(sorted_x, sorted_y);



    }

    public static int countRight(int[] myNumbers, int[] rightNumbers)
    {
        int count = 0;
        for(int number: myNumbers){
            //int compare = number;
            for(int rightnumber: rightNumbers){
                if(number == rightnumber){
                    count ++;
                }
            }
        }

        System.out.println("Amount of numbers that are the same: " + count);
        return count;
    }

    //Algorithm to sort my arrays before using the fastCountright-function
    public static int[] insertionSort(int[] arr) {
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
        //System.out.println(Arrays.toString(arr));
        return arr;
    }


    public static int fastCountRight(int[] myNumbers, int[] rightNumbers)
    {   
        int count = 0;

        for(int number: rightNumbers){
            int low = 0;
            int high = myNumbers.length - 1;
            int mid = (low + high) / 2;

                //Binary-Search instead of a nested for-loop
                while (low <= high){
                    if (myNumbers[mid] == number) {
                        count ++;
                        //Break inner while loop to move on to the next number that we are looking for 
                        break;
                    } else if (myNumbers[mid] < number) {
                        low = mid + 1;
                        mid = (low + high) / 2 ;
                    } else{
                        high = mid - 1;
                        mid = (low + high) / 2;
                    }
                }
        }

    System.out.println("Amount of numbers that are the same (faster method): " + count);
    return count;

    }
    
}
