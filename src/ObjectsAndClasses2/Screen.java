package ObjectsAndClasses2;

public class Screen {
    private String value = "";

    Screen(String value){
        this.value = value;
    }

    Screen(){}

    public void addToValue(String value){
        this.value += value;
    }

    public void setValue(String value){
        this.value = value;
    }

    public void clearValue(){
        this.value = "";
    }

    public String getValue(){
        return value;
    }
}
