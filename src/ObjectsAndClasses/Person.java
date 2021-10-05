package ObjectsAndClasses;

public class Person {
    // data field
    private String name;
    String surname;
    String gender;
    String eyeColor;
    String hairColor;
    String nation;
    int age;
    String education;
    float height;
    float weight;

    Person(){
        // contructor chaining
        System.out.println("Constructor of Person class");
    }

    Person(String name, String surname, String gender){
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    // Dinamik özellikler (methodlar) = behaviours = actions
    public void speak(){
        System.out.println("Here I am!");
    }

    public void eat(){
        System.out.println("Delicious!");
    }

    public void run(){
        System.out.println("Running like Usain Bolt!");
    }

    private void dummyF(){
    }
    public static void dummyF2(){}

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", hairColor='" + hairColor + '\'' +
                ", nation='" + nation + '\'' +
                ", age=" + age +
                ", education='" + education + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
