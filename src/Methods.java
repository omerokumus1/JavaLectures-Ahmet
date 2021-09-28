import java.util.Arrays;

public class Methods {

    public static void main(String[] args) {
        System.out.println(Math.abs(-3)); // code reusability
//        int a = square(5);
//        int b = square(7);
//        int c = square(-11);

        int[] source1 = {1, 2, 3, 4, 5, 6};
        int[] destination1 = new int[source1.length];
        //  {0, 0, 0, 0, 0, 0}
        for (int i = 0; i < source1.length; i++) {
            destination1[i] = source1[i];
        }
        System.out.println("dst1: " + Arrays.toString(destination1));
        /*
        .
        .
        .
        .

         */
        int[] source2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] destination2 = new int[source2.length];
        //  {0, 0, 0, 0, 0, 0}
        for (int i = 0; i < source2.length; i++) {
            destination2[i] = source2[i];
        }
        System.out.println("dst2: " + Arrays.toString(destination2));

        int[] destination3 = new int[source1.length];
        destination3 = myArrayCopy(source1, destination3);
        System.out.println("dst3: " + Arrays.toString(destination3));
        /*
        .
        .
        .
        .

         */
        int[] destination4 = new int[source2.length];
        destination4 = myArrayCopy(source2, destination4);
        System.out.println("dst4: " + Arrays.toString(destination4));

        // caller method: çağıran method
        // callee method: çağırılan method
        // method invocation = method calling = method çağırma,

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,5,4,3,2,1};
        int[] result = arrayConcatenation(arr1, arr2);
        System.out.println("Concatenation: "+Arrays.toString(result));

        System.out.println("Array remove: " + Arrays.toString( arrayRemove(arr2, 4)));

        // pass-by-value
        int x = 0;
        passByValue(x);
        System.out.println("in main x = " + x);
        x = 3;
        passByValue(x);
        System.out.println("in main x = " + x);

        // pass-by-reference
        int[] arr = {1,2,3,4,5};
        System.out.println(arr);
        passByReference(arr);
        System.out.println("in main: " + Arrays.toString(arr));

    }
    public static void dummyFunc(){
        int x = 3; // local variable
    }
    public static void passByReference(int[] arr){
        System.out.println("in passByReference: " + Arrays.toString(arr));
        arr[0] = -1;
        System.out.println("in passByReference: " + Arrays.toString(arr));

    }

    public static void passByValue(int x){
        System.out.println("in passByValue method x = " + x);
        x = 7;
        System.out.println("in passByValue method x = " + x);
    }

    public static int[] arrayRemove(int[] source, int item){
        int[] newArray = new int[source.length-1];
        // {1,2,4,5}
        int index = getIndex(source, item);
        slideElementsLeft(source, index);

        // array copy
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = source[i];
        }

        return newArray;

    }

    private static void slideElementsLeft(int[] source, int index) {
        // slide elements back
        for (int i = index; i < source.length-1; i++) {
            source[i] = source[i+1];
        }
    }

    private static int getIndex(int[] source, int item) {
        // find the index of the element
        int index = -1;
        for (int i = 0; i < source.length; i++) {
            if (item == source[i]){
                index = i;
                break;
            }
        }
        return index;
    }

    public static int[] arrayConcatenation(int[] firstArray, int[] secondArray) {
        int size = firstArray.length + secondArray.length;
        int[] concatenatedArray = new int[size];

        for (int i = 0; i < firstArray.length; i++) {
            concatenatedArray[i] = firstArray[i];
        }
        int concArrayIndex = -1;
        for (int i = 0; i < secondArray.length; i++) {
            concArrayIndex = i + firstArray.length;
            concatenatedArray[concArrayIndex] = secondArray[i];
        }

        return concatenatedArray;
    }

    public static int[] myArrayCopy(int[] source, int[] destination) {
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }
        return destination;
    }


    public static int square(int x) {
        return x * x;
    }

}
