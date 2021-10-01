package ObjectsAndClasses2;


// iki kez operasyon girme işlemi kontrol edilmedi: lastPressedButton değişkeni ile kontrol edebilirsin
// double sayılarla işlem yapamıyor, eklenebilir
// en fazla 2 tane sayıyla işlem yapabiliyor
// constructor yazılmadı

public class Calculator {
    private String brand;
    private String color;
    Screen screen = new Screen(); // aggregation
    private int numberCount = 0;
    Button[] buttons = {
            new Button("0"),
            new Button("1"),
            new Button("2"),
            new Button("3"),
            new Button("4"),
            new Button("5"),
            new Button("6"),
            new Button("7"),
            new Button("8"),
            new Button("9"),
            new Button("*"),
            new Button("/"),
            new Button("+"),
            new Button("-"),
    };

    public void pressButton(String value){
        if (numberCount != 2) {
            screen.addToValue(value);
            if (value == "*" || value == "/" || value == "+" || value == "-") {
                numberCount++;
            }
        }
        else
            System.out.println("No more numbers are allowed");
    }

    public void calculate(){
        int indexOfMultiplication = screen.getValue().indexOf("*");
        int indexOfDivision = screen.getValue().indexOf("/");
        int indexOfAddition  = screen.getValue().indexOf("+");
        int indexOfSubtraction  = screen.getValue().indexOf("-");
        if (indexOfMultiplication != -1){
            String[] numberAsString = screen.getValue().split("\\*"); // 12*35 -> ["12"], ["35"]
            int firstNumber = Integer.parseInt(numberAsString[0]);
            int secondNumber = Integer.parseInt(numberAsString[1]);
            int result = firstNumber * secondNumber;
            screen.setValue(result + "");
        }
        else if (indexOfDivision != -1){
            String[] numberAsString = screen.getValue().split("/");
            int firstNumber = Integer.parseInt(numberAsString[0]);
            int secondNumber = Integer.parseInt(numberAsString[1]);
            int result = firstNumber / secondNumber;
            screen.setValue(result + "");
        }
        else if (indexOfAddition != -1){
            String[] numberAsString = screen.getValue().split("\\+");
            int firstNumber = Integer.parseInt(numberAsString[0]);
            int secondNumber = Integer.parseInt(numberAsString[1]);
            int result = firstNumber + secondNumber;
            screen.setValue(result + "");
        }
        else if (indexOfSubtraction != -1){
            String[] numberAsString = screen.getValue().split("-");
            int firstNumber = Integer.parseInt(numberAsString[0]);
            int secondNumber = Integer.parseInt(numberAsString[1]);
            int result = firstNumber - secondNumber;
            screen.setValue(result + "");
        }
        else{
            System.out.println("You need to specify the operation!");
        }
    }

    public String getResult(){
        return screen.getValue();
    }

}
