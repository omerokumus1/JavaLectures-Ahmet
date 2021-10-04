package ObjectsAndClasses2;

public class Box {
    /*
        1. Capacities
            - Book[]: 3
            - Eraser[]: 5
            - Pencil[]: 4
        2. Check if arrays are full or not
        3. Write increment/decrement numberOf... methods
     */

    private Book[] books;
    private int numberOfBooks;
    private final int BOOK_CAPACITY = 3;

    private Earphone earphone;
    private int numberOfEarphone;

    private Eraser[] erasers;
    private int numberOfErasers;
    private final int ERASER_CAPACITY = 5;

    private Pencil[] pencils;
    private int numberOfPencils;
    private final int PENCIL_CAPACITY = 4;

    private Calculator calculator;

    Box() {
        initializeDataField();
    }

    Box(Book[] books, Earphone earphone, Eraser[] erasers, Pencil[] pencils) {
        initializeDataField();
        setDataField(books, earphone, erasers, pencils);
    }

    private void setDataField(Book[] books, Earphone earphone, Eraser[] erasers, Pencil[] pencils) {
        setBooks(books);
        setEarphone(earphone);
        setErasers(erasers);
        setPencils(pencils);
    }

    public void setCalculator(Calculator calculator){
        this.calculator = calculator;
    }
    // remove yazılabilir. (Earphone gibi davranacak)


    public Calculator getCalculator() {
        return calculator;
    }

    public void addBook(Book book) {

        if (!isBookAvailable(book) && !isBooksFull()){
            books[numberOfBooks] = book;
            numberOfBooks++;
        }
        else if(isBookAvailable(book)){
            System.out.println("Book is already available.");
        }
        else if (isBooksFull()){
            System.out.println("No more room left for books.");
        }
    }

    public void removeBook(Book book) {
        int bookIndex = getBookIndex(book);
        if (bookIndex != -1) {
            books[bookIndex] = null;
            arrangeBooks(bookIndex);
            numberOfBooks--;
        } else {
            System.out.println("Book is not available.");
        }
    }

    private boolean isBooksFull() {
        return numberOfBooks == books.length;
    }

    private int getBookIndex(Book book) {
        int bookIndex = -1;
        for (int i = 0; i < books.length; i++) {
            if (book.equals(books[i])) {
                bookIndex = i;
                break;
            }
        }
        return bookIndex;
    }

    private boolean isBookAvailable(Book book) {
        for (int i = 0; i < numberOfBooks; i++) {
            if (book.equals(books[i])) {
                return true;
            }
        }
        return false;
    }

    private void arrangeBooks(int bookIndex) {
        for (int i = bookIndex; i < books.length - 1; i++) {
            books[i] = books[i + 1];
        }
        books[books.length - 1] = null;
    }


    public void addEraser(Eraser eraser) {
        if (!isEraserAvailable(eraser) && !isEraserFull()) {
            erasers[numberOfErasers] = eraser;
            numberOfErasers++;
            System.out.println("Eraser section is updated!!\nNew number of eraser: " + numberOfErasers);
        } else if (isEraserAvailable(eraser)) {
            System.out.println("Eraser is already available.");
        } else if (isEraserFull()) {
            System.out.println("No more room left for erasers");
        }
    }


    public void removeEraser(Eraser eraser) {
        int eraserIndex = getEraserIndex(eraser);
        if (eraserIndex != -1) {
            erasers[eraserIndex] = null;
            numberOfErasers--;
            arrangeErasers(eraserIndex);

        } else
            System.out.println("Eraser is not available.");

    }

    private void arrangeErasers(int eraserIndex) {
        for (int i = eraserIndex; i < erasers.length - 1; i++) {
            erasers[i] = erasers[i + 1];
        }
        erasers[erasers.length - 1] = null;
    }

    private boolean isEraserFull() {
        return numberOfErasers == erasers.length;
    }

    private boolean isEraserAvailable(Eraser eraser) {
        for (int i = 0; i < numberOfErasers; i++) {
            if (eraser.equals(erasers[i])) {
                return true;
            }
        }
        return false;
    }

    private int getEraserIndex(Eraser eraser) {
        int index = -1;
        for (int i = 0; i < erasers.length; i++) {
            if (eraser.equals(erasers[i])) {
                index = i;
                break;
            }
        }
        return index;
    }



    public void addPencil(Pencil pencil) {
        if (!isPencilAvailable(pencil) && !isPencilFull()) {
            pencils[numberOfPencils] = pencil;
            numberOfPencils++;
        } else if (isPencilAvailable(pencil)) {
            System.out.println("Pencil already available!!");
        } else if (isPencilFull()) {
            System.out.println("No more available room for pencil!");
        }
    }

    public void removePencil(Pencil pencil) {
        int pencilIndex = getPencilIndex(pencil);
        if (pencilIndex != -1) {
            pencils[pencilIndex] = null;
            numberOfPencils--;
            arrangePencils(pencilIndex);
        } else
            System.out.println("Pencil is not available.");
    }

    private void arrangePencils(int pencilIndex) {
        for (int i = pencilIndex; i < pencils.length - 1; i++) {
            pencils[i] = pencils[i + 1];
        }
        pencils[pencils.length - 1] = null;
    }

    private boolean isPencilFull() {
        return numberOfPencils == pencils.length;

    }

    private boolean isPencilAvailable(Pencil pencil) {
        for (int i = 0; i < numberOfPencils; i++) {
            if (pencil.equals(pencils[i])) ;
            return true;
        }
        return false;
    }

    private int getPencilIndex(Pencil pencil) {
        int index = -1;
        for (int i = 0; i < pencils.length; i++) {
            if (pencil.equals(pencils[i])) {
                index = i;
                break;
            }
        }
        return index;
    }


    public void removeEarphone() {
        this.earphone = null;
        numberOfEarphone--;
    }


    private void initializeDataField() {
        books = new Book[BOOK_CAPACITY];
        erasers = new Eraser[ERASER_CAPACITY];
        pencils = new Pencil[PENCIL_CAPACITY];
        numberOfBooks = 0;
        numberOfErasers = 0;
        numberOfPencils = 0;
        numberOfEarphone = 0;
    }

    public void setBooks(Book[] books) {
        if (books.length > BOOK_CAPACITY) {
            bookCopy(books);
            numberOfBooks = BOOK_CAPACITY;
            System.out.println("The size is excessed. The last " + (books.length - BOOK_CAPACITY) + " books are not added.");
            // kutuya eklenemeyen kitapları bastır
        } else {
            bookCopy(books);
            numberOfBooks = books.length;
        }
    }

    private void bookCopy(Book[] books) {
        int length = Math.min(books.length, BOOK_CAPACITY);
        for (int i = 0; i < length; i++) {
            this.books[i] = books[i];
        }
    }

    public void setEarphone(Earphone earphone) {
        this.earphone = earphone;
        numberOfEarphone++;

    }

    public void setErasers(Eraser[] erasers) {
        if (erasers.length > ERASER_CAPACITY) {
            eraserCopy(erasers);
            numberOfErasers = ERASER_CAPACITY;
            System.out.println("The size is excessed. The last " + (erasers.length - ERASER_CAPACITY) + " erasers are not added.");
            // kutuya eklenemeyen silgileri bastır
        } else {
            eraserCopy(erasers);
            numberOfErasers = erasers.length;
        }
    }

    private void eraserCopy(Eraser[] erasers) {
        int length = Math.min(erasers.length, ERASER_CAPACITY);

        for (int i = 0; i < length; i++) {
            this.erasers[i] = erasers[i];
        }
    }

    public void setPencils(Pencil[] pencils) {
        if (pencils.length > PENCIL_CAPACITY) {
            pencilCopy(pencils);
            numberOfPencils = PENCIL_CAPACITY;
            System.out.println("The size is excessed. The last " + (pencils.length - PENCIL_CAPACITY) + " pencils are not added.");
            // kutuya eklenemeyen kalemleri bastır
        } else {
            pencilCopy(pencils);
            numberOfPencils = pencils.length;
        }

    }

    private void pencilCopy(Pencil[] pencils) {
        int length = Math.min(pencils.length, PENCIL_CAPACITY);
        for (int i = 0; i < length; i++) {
            this.pencils[i] = pencils[i];
        }
    }

    public Book[] getBooks() {
        return books;
    }

    public int getBOOK_CAPACITY() {
        return BOOK_CAPACITY;
    }

    public Earphone getEarphone() {
        return earphone;
    }

    public Eraser[] getErasers() {
        return erasers;
    }

    public int getERASER_CAPACITY() {
        return ERASER_CAPACITY;
    }

    public Pencil[] getPencils() {
        return pencils;
    }

    public int getPENCIL_CAPACITY() {
        return PENCIL_CAPACITY;
    }


    public String toString(){
        StringBuilder content = new StringBuilder("");

        // add books
        content = addBooksToContent(content);

        // add earphone
        content = addEarphoneToContent(content);

        // add erasers
        content = addErasersToContent(content);

        // add pencils
        content = addPencilsToContent(content);

        return content.toString();

    }

    private StringBuilder addBooksToContent(StringBuilder content) {
        content.append("There are ").append(numberOfBooks).append(" books. Which are:\n");
        for (int i = 0; i < numberOfBooks; i++) {
            content.append(i + 1).append(". Book:\n").append(books[i].toString()).append("\n");
        }
        return content;
    }

    private StringBuilder addEarphoneToContent(StringBuilder content) {
        content.append("There is ").append(numberOfEarphone).append(" earphone.\n");
        for (int i = 0; i < numberOfEarphone; i++) {
            content.append(earphone.toString()).append("\n");
        }
        return content;
    }

    private StringBuilder addErasersToContent(StringBuilder content) {
        content.append("There are ").append(numberOfErasers).append(" erasers. Which are:\n");
        for (int i = 0; i < numberOfErasers; i++) {
            content.append(i + 1).append(". Eraser:\n").append(erasers[i].toString()).append("\n");
        }
        return content;
    }

    private StringBuilder addPencilsToContent(StringBuilder content) {
        content.append("There are ").append(numberOfPencils).append(" pencils. Which are:\n");
        for (int i = 0; i < numberOfPencils; i++) {
            content.append(i + 1).append(". Pencil:\n").append(pencils[i].toString()).append("\n");
        }
        return content;
    }

}
