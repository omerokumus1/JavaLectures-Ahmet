package ObjectsAndClasses2;

public class Book {
    private String bookName;
    private String bookColor;
    private int totalPageNumber;
    private String authorName;
    private String genre;

    Book(String bookName, String bookColor, int totalPageNumber, String authorName, String genre){
        this.bookName = bookName;
        this.bookColor = bookColor;
        this.totalPageNumber = totalPageNumber;
        this.authorName = authorName;
        this.genre = genre;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookColor() {
        return bookColor;
    }

    public int getTotalPageNumber() {
        return totalPageNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getGenre() {
        return genre;
    }

    public boolean equals(Book book){
        boolean areNamesEqual = this.bookName == book.bookName;
        boolean areColorsEqual = this.bookColor == book.bookColor;
        boolean arePageNumberEqual = this.totalPageNumber == book.totalPageNumber;
        boolean areAuthorsEqual = this.authorName == book.authorName;
        boolean areGenresEqual = this.genre == book.genre;

        return areNamesEqual && areColorsEqual && arePageNumberEqual && areAuthorsEqual && areGenresEqual;
    }
}
