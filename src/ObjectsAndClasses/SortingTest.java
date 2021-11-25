package ObjectsAndClasses;

import java.util.Arrays;

public class SortingTest {
    public static void main(String[] args) {
        System.out.println("Bubble sort test result: " + bubbleSortTest());
    }

    private static boolean bubbleSortTest(){
        int[] sourceArray = {5,4,3,2,1};
        int[] expectedArray = {1,2,3,4,5};
        int[] actualArray = Sorting.bubbleSort(sourceArray);
        return Arrays.equals(expectedArray, actualArray);
    }

    private static boolean bubbleSortTest2(){
        int[] expectedArray = SortingTestData.getArrayWithDuplicatesExpected;
        int[] actualArray = Sorting.bubbleSort(SortingTestData.arrayWithDuplicates);
        return Arrays.equals(expectedArray, actualArray);
    }


}
