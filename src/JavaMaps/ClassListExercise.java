package JavaMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ClassListExercise {
    public static void main(String[] args) {
        programStart();
//        Map<String, String> urlMap = new HashMap<>();
//        MapWrapper mapWrapper = new MapWrapper(urlMap);
//        MapWrapper mapWrapper1 = new MapWrapper();
//        mapWrapper1.getKeysAsArrayList();
//        urlMap.put("courses/ud9012", "https://classroom.udacity.com/courses/ud9012"); // wrapper
//        goToUrl(urlMap.get("courses/ud9012"));
    }

    private static void programStart() {
        Map<String, ArrayList<String>> classListMap = new HashMap<>();
        createClassesAndAddStudents(classListMap);
        printClassList(classListMap);
    }

    private static void printClassList(Map<String, ArrayList<String>> classListMap) {
        System.out.println(classListMap);
    }

    private static void createClassesAndAddStudents(Map<String, ArrayList<String>> classListMap) {

        Scanner input = new Scanner(System.in);
        String classLabel;
        while (true) {
            System.out.print("Enter class label. Enter q to quit: ");
            classLabel = input.nextLine();
            if (classLabel.equals("q"))
                break;
            else
                obtainStudents(classListMap, classLabel);

        }
    }

    private static void obtainStudents(Map<String, ArrayList<String>> classListMap, String classLabel) {
        Scanner input = new Scanner(System.in);
        String studentName;
        while (true) {
            System.out.print("Enter student name. Enter q to quit: ");
            studentName = input.nextLine();
            if (studentName.equals("q"))
                break;

            if (doesClassExist(classListMap, classLabel)) {
                addStudent(classListMap, classLabel, studentName);
            } else {
                createClassAndAddStudent(classListMap, classLabel, studentName);
            }
        }
    }

    private static boolean doesClassExist(Map<String, ArrayList<String>> classListMap, String classLabel) {
        return classListMap.containsKey(classLabel);
    }

    private static void createClassAndAddStudent(Map<String, ArrayList<String>> classListMap, String classLabel, String studentName) {
        ArrayList<String> studentList = new ArrayList<>();
        studentList.add(studentName);
        classListMap.put(classLabel, studentList);
    }

    private static void addStudent(Map<String, ArrayList<String>> classListMap, String classLabel, String studentName) {
        ArrayList<String> studentList = classListMap.get(classLabel);
        studentList.add(studentName);
    }
}
