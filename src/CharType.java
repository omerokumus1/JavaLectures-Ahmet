public class CharType {
    // 1010101010110010101
    /*
        ----------
        ----------
        ----------
        ----------
        ----------
        ----------
        ----------

     */
    public static void main(String[] args) {
        // hexadecimal sistem: 0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F
        System.out.println(new Locker());
        System.out.println((char)65);
        // A-Z 65 to 90
        // a-z 97 to 122
        // '0'-'9' 48 to 57
        char ch = '8';
        if (ch >= 97 && ch <= 122)
            System.out.println("lower char");
        else if (ch >= 65 && ch <= 90)
            System.out.println("upper char");
        else if(ch >= 48 && ch <= 57)
            System.out.println("digit");

        ch = ' ';
        System.out.println(ch == 32);
        ch += 16;
        System.out.println(ch);
        ch = 65;
        System.out.println(ch);
        char ch2 = (char)(ch+32);
        System.out.println(ch2);
    }

//    private static boolean startWith(String str, char ch){
//        boolean result
//    }
}
