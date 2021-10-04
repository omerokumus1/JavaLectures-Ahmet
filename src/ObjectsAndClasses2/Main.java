package ObjectsAndClasses2;

public class Main {
    public static void main(String[] args) {
        Book[] books = {
                new Book("Gözlerini Sımsıkı Kapat", "White", 500, "John Verdon", "Crime Novel"),
                new Book("Kurt Gölü", "White", 450, "John Verdon", "Crime Novel")
        };

        Earphone earphone = new Earphone("Apple", "Airpods Pro", "TWS", "White", 10, true);

        Eraser[] erasers = {
                new Eraser("Faber Castell", "Blue"),
                new Eraser("Faber Castell", "Black")
        };

        Pencil[] pencils = {
                new Pencil("Faber Castell", "Blue"),
                new Pencil("Faber Castell", "Black"),
                new Pencil("Faber Castell", "Red"),
                new Pencil("Faber Castell", "Green"),
                new Pencil("Faber Castell", "Yellow"),
                new Pencil("Faber Castell", "Gray"),
                new Pencil("Faber Castell", "Pink"),
                new Pencil("Faber Castell", "Purple")
        };

        Box box = new Box(books, earphone, erasers, pencils);
        System.out.println(box);
//
//        Book newBook = new Book("Peter Pan Ölmeli", "White", 550, "John Verdon", "Crime Novel");
//        box.addBook(newBook);
//
//        Book book = new Book("Kurt Gölü", "White", 450, "John Verdon", "Crime Novel");
//        box.removeBook(book);
//
////        System.out.println(box);
//
//        box.setCalculator(new Calculator());
//
//        Calculator myCalculator = box.getCalculator();
//        myCalculator.pressButton("12");
//        myCalculator.pressButton("/");
//        myCalculator.pressButton("/");
//        myCalculator.pressButton("12");
//        myCalculator.calculate();
//        System.out.println(myCalculator.getResult());
//


    }
}
