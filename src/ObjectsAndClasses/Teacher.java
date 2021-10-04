package ObjectsAndClasses;

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

    public void dummyFunction(){
        super.eat();
    }
}
