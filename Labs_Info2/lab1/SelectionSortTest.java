import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class SelectionSortTest {
    private int[] get100RandomInts() {
        Random randInt = new Random();
        int[] randomIntArray = new int[100];
        for(int i = 0; i < randomIntArray.length; i++){
            randomIntArray[i] = randInt.nextInt(101);
        }

        return randomIntArray;
    }

    // returns the names contained in the specified file in an array
    private String[] getNames() throws IOException {
        // replace it with your own path
        String fileName = "/Users/sso_user/Desktop/Lab1_Info2";

        FileInputStream fis = new FileInputStream(fileName);
        String text = new Scanner(fis).useDelimiter("\\A").next();
        String[] names = text.split(" ");
        return names;
    }

    private void testSortInt() {
        int a[] = get100RandomInts();

        System.out.println("Original int array");
        System.out.println(Arrays.toString(a));

        SelectionSort sort = new SelectionSort();
        sort.sortInt(a);

        System.out.println("Sorted int array");
        System.out.println(Arrays.toString(a));
    }

    private void testSortString(String[] a) {
        System.out.println("Original String array");
        System.out.println(Arrays.toString(a));

        SelectionSort sort = new SelectionSort();
        //sort.sortString(a);

        System.out.println("Sorted String array");
        System.out.println(Arrays.toString(a));

        System.out.println("The 938th name is " + a[937]);
    }

    public static void main(String[] args) throws IOException {
        SelectionSortTest sortingTest = new SelectionSortTest();

        sortingTest.testSortInt();

        // String[] a = sortingTest.getNames();
        // sortingTest.testSortString(a);
    }
}