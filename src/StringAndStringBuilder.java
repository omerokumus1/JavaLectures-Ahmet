import java.util.Arrays;

public class StringAndStringBuilder {
    public static void main(String[] args) {
        // stringler birer objedir
        String str = "New string";

        // string objeler değişmezler (immutable)
        str += "2";
        str = "another string";

        // constructor'dan üretilebilir
        str = new String();
        char[] charArray = {'c', 'h', 'a', 'r', 'a', 'r', 'r', 'a', 'y'};
        str = new String(charArray);
        System.out.println(str);
        int[] intArray = {1,2,3,4,5,6};
        str = new String("New string");

        // interned string
        str = "new string";
        String str2 = "new string";
        String str3 = new String("new string");
        System.out.println("str == str2: " + (str == str2));
        System.out.println("str == str3: " + (str == str3));


        // replace methods
        String str4 = str.replace('n', 'k');
        System.out.println("n is changed with k: " + str4);

        String str5 = str.replace("new", "my");
        System.out.println("new is changed with my: " + str5 );

        String str6 = str.replaceFirst("n", "k");
        System.out.println("first n is changed with k: " + str6);

        String[] splitString = str.split(" "); //
        System.out.println("Split string: "+ Arrays.toString(splitString));

        // String to array
        char[] charArray2 = str.toCharArray();
        System.out.println(Arrays.toString(charArray2));

        char[] dst = {'J', 'A', 'V', 'A', '1', '3', '0', '1'};
        "CS3720".getChars(2,6, dst, 4);
        str = new String(dst);
        System.out.println("new string: " + str);

        // array to string
        str = String.valueOf(dst);
        System.out.println("from dst: " + str);


        // StringBuilder: stringlerden farklı değişebilir (mutable) olması
        // StringBuffer: StringBuilder ile aynıdır. Tek farkı concurrent operasyonlarda StringBuffer kullanılır.
        StringBuilder stringBuilder = new StringBuilder("string builder");
        stringBuilder.append(5);
        System.out.println("string builder: " + stringBuilder);
        stringBuilder.delete(0,3);
        System.out.println("string builder: " + stringBuilder);
        stringBuilder.deleteCharAt(0);
        System.out.println("string builder: " + stringBuilder);

    }
}
