import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

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
        String fileName = "C:\\Users\\s-isa\\Desktop\\Medieninformatik\\semester_2\\comp_sci_2\\Labs_Info2\\lab1\\names.txt";

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

        //Using my code from the first exercise to check if it works
        System.out.println("Exersice 1_1 solution sorted");
        Lab1 sort_check = new Lab1();
        sort_check.exercise1_1(a);


        System.out.println("Sorted int array");
        System.out.println(Arrays.toString(a));


    }

    private void testSortString(String[] a) {
        System.out.println("Original String array");
        System.out.println(Arrays.toString(a));

        InsertionSort sort = new InsertionSort();
        sort.sortString(a);

        System.out.println("Sorted String array");
        System.out.println(Arrays.toString(a));


        System.out.println("The 938th name is " + a[937]);
    }

    public static void main(String[] args) throws IOException {
        SelectionSortTest sortingTest = new SelectionSortTest();

        sortingTest.testSortInt();

        String[] a = sortingTest.getNames();
        sortingTest.testSortString(a);
    }
}