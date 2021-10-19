package FileOperations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class FileOperations {
    public static void main(String[] args) {

        createTable();
    }

    static void createTable() {
        System.out.printf("%-20s\n", "name surname");
        System.out.printf("%s, %10s\n", "Ömer","Okumuş");
        System.out.printf("%s, %10s\n", "Ömer","Okumuş");
        System.out.printf("%s, %10s\n", "Ömer","Okumuş");
        System.out.printf("%s, %10s\n", "Ömer","Okumuş");
        System.out.printf("%s, %10s\n", "Ömer","Okumuş");
        System.out.printf("%s, %10s\n", "Ömer","Okumuş");
    }

    static void formatOutput() {
        String name = "Ömer";
        String sname = "Okumuş";
        int age = 23;
        System.out.printf("My name is %10s and I am %d years old\n", name, age);
        System.out.println("My name is " + name + " and my surname is " + sname);
//        System.out.printf("SELECT name FROM %s WHERE name = %s", name_table, "Ömer");
    }

    static void append() {
        File file = new File("test2.txt");
        try {
            Scanner sc = new Scanner(file);
            StringBuilder sb = getContent(sc);
            sc.close();
            sb.append("appended content");
            PrintWriter pw = new PrintWriter(file);
            pw.println(sb);
            pw.close();
        } catch (Exception e) {
            System.out.println("append exception");
        }
    }

    private static StringBuilder getContent(Scanner sc) {
        StringBuilder sb = new StringBuilder();
        while (sc.hasNext()) {
            sb.append(sc.nextLine());
            sb.append("\n");
        }

        return sb;
    }

    static void scanner() {
        File file = new File("test2.txt");
        try {
            Scanner sc = new Scanner(file);
            System.out.println("hasNext?: " + sc.hasNext());
            System.out.println("nextLine: " + sc.nextLine());
            System.out.println("nextLine: " + sc.nextLine());
            System.out.println("nextLine: " + sc.nextLine());
            System.out.println("next: " + sc.next());
            System.out.println("next: " + sc.next());
            System.out.println("next: " + sc.next());
            System.out.println("next: " + sc.next());
            char[] chars = sc.next().toCharArray();
            System.out.println("chars: " + Arrays.toString(chars));
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("scanner exception");
        }
    }

    static void tryWith() { // otomatik olarak close methodunu çalıştırır.
        try (PrintWriter pw = new PrintWriter("test2.txt")) {
            pw.println("try-with");
        } catch (Exception e) {
            System.out.println("try-with exception");
        }
    }

    static void printWriter2() {
        try {
            PrintWriter pw = new PrintWriter("test2.txt");
            pw.println("test4");
            pw.close();
        } catch (Exception e) {
            System.out.println("Exception occured.");
        }
    }

    public static void printWriter() {
        File file = new File("src\\FileOperations\\test.txt");
        try {
            PrintWriter pw = new PrintWriter(file);
            pw.println("println test");
            pw.print("println test");
            pw.println(" print test");
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }

    public static void file() {
        File file = new File("src\\FileOperations\\test.txt");
        System.out.println("exists: " + file.exists());
        System.out.println("Can it be read? " + file.canRead());
        System.out.println("Can it be written? " + file.canWrite());
        System.out.println("Is it a directory? " + file.isDirectory());
        System.out.println("Is it a file? " + file.isFile());
        System.out.println("Is it absolute? " + file.isAbsolute());
        System.out.println("Is it hidden? " + file.isHidden());
        System.out.println("Absolute path is " +
                file.getAbsolutePath());
        System.out.println("Last modified on " +
                new java.util.Date(file.lastModified()));
    }
}
