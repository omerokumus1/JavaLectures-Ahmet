import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {3, 2, 5, 4, 6, 1};
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Sorted array:" + Arrays.toString(bubbleSort(arr)));

    }

    public static int[] bubbleSort(int[] arr) {
        // soldaki eleman ile sağdaki elemanı kıyasla eğer büyükse yerlerini değiştir
        // index'i 1 arttır.
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i + 1] < arr[i]) {
                    switchConsecutiveNumbers(arr, i);
                }
            }
        }
        return arr;
    }

    private static void switchConsecutiveNumbers(int[] arr, int i) {
        int temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
    }
}
