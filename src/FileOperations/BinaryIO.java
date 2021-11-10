package FileOperations;

import java.io.*;

public class BinaryIO {
    public static void main(String[] args) {
//        byte b = (byte) 256;
//        System.out.println(b);

//        int x = 1;
//        Integer.toBinaryString(x);
//

//        writeBinary();
//        writeLetter();
//        readBinary();
        dataOutputStream();
        dataInputStream();
    }

    private static void dataInputStream() {
        try(DataInputStream input = new DataInputStream(new FileInputStream("binary2.dat"))){
            int b;
            char c;
            do{
//                b = input.read();
                c = input.readChar();
//                System.out.println(b);
                System.out.println(c);
            } while (true);
        } catch (IOException e) {
            System.out.println("Exception");
        }
    }

    private static void dataOutputStream() {
        try(DataOutputStream output = new DataOutputStream(new FileOutputStream("binary2.dat"))){

            output.writeByte(0);
            output.writeByte(65);
//            output.writeByte(66);
//            output.writeByte(67);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeLetter() {
        try {
            FileOutputStream output = new FileOutputStream("binary.dat");
            output.write(65);
            output.close();
        } catch (FileNotFoundException e) {
            System.out.println("FileOutputStream error");
        } catch (IOException e) {
            System.out.println("IOException");
        }
    }

    private static void readBinary() {
        try (FileInputStream input = new FileInputStream("binary.dat")) {
            int value;
//            do {
//                value = input.read();
//                System.out.println(value);
//
//            } while (value != -1);
//
            while ((value = input.read()) != -1) {
                System.out.println(value);

            }

        } catch (FileNotFoundException e) {
            System.out.println("FileInputStream error");
        } catch (IOException e) {
            System.out.println("IOException");
        }
    }

    private static void writeBinary() {
        try {
            FileOutputStream output = new FileOutputStream("binary.dat");
            for (int i = 0; i < 10; i++) {
                output.write(i);

            }
            output.close();
        } catch (FileNotFoundException e) {
            System.out.println("FileOutputStream error");
        } catch (IOException e) {
            System.out.println("IOException");
        }
    }

    private static void convert(char c) {
        if (c == '1')
            System.out.println("00110001");
        else if (c == '2') {

        }
    }

    private static void convertBack(String i) {
        if (i.equals("00110001")) {
            System.out.println("1");
        }
    }

}
