package ObjectsAndClasses;

import java.util.Arrays;

public class Teacher extends Person {
    private String[] lectures = new String[5];
    private int lectureCount = 0;

    Teacher(){
        this("Unknown", "Unknown", "Unknown", new String[5]);
    }

    Teacher(String name, String surname, String gender, String[] lectures){
        super(name, surname, gender);
//        this.surname = surname;
        this.lectures = lectures;
        // constructor chaining
        System.out.println("Contructor of Teacher class.");
    }

    public void addLecture(String lecture){
        lectures[lectureCount] = lecture;
        lectureCount++;
//        System.out.println("reference in teacher class: " + this);
    }



    public String[] getLectures() {

        return lectures;
    }

    @Override
    public void speak() {
        System.out.println("--");
        super.speak();
        System.out.println("Hello, I am a Teacher!");
    }

    public void dummyFunction(){
        super.eat();
    }

    @Override
    public String toString() {
//        String content = super.toString();
        return "Teacher{" +
                "lectures=" + Arrays.toString(lectures) +
                ", lectureCount=" + lectureCount +
                '}';
    }
//
//    @Override
//    public String toString() {
//        return "Teacher{" +
//                "surname='" + surname + '\'' +
//                ", gender='" + gender + '\'' +
//                ", eyeColor='" + eyeColor + '\'' +
//                ", hairColor='" + hairColor + '\'' +
//                ", nation='" + nation + '\'' +
//                ", age=" + age +
//                ", education='" + education + '\'' +
//                ", height=" + height +
//                ", weight=" + weight +
//                ", lectures=" + Arrays.toString(lectures) +
//                ", lectureCount=" + lectureCount +
//                '}';
//    }




}
