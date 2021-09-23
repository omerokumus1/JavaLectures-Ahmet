package ObjectsAndClasses;

public class Person {
    // data field
    String name;
    String surname;
    String gender;
    String eyeColor;
    String hairColor;
    String nation;
    int age;
    String education;
    float height;
    float weight;

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


}
