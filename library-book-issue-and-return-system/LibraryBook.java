public class LibraryBook {
    private int bookId;
    private String bookTitle;
    private boolean isAvailable;

    // Constructor
    public LibraryBook(int bookId, String bookTitle, boolean isAvailable) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.isAvailable = isAvailable;
    }

    // Getters and Setters
    public int getBookId() {
        return bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
