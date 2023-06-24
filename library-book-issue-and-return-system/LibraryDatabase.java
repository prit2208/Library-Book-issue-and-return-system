import java.sql.*;

public class LibraryDatabase {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/library_db";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "password";

    public static void issueBook(int bookId) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String query = "UPDATE books SET is_available = false WHERE book_id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, bookId);
            statement.executeUpdate();
            System.out.println("Book with ID " + bookId + " issued successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void returnBook(int bookId) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String query = "UPDATE books SET is_available = true WHERE book_id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, bookId);
            statement.executeUpdate();
            System.out.println("Book with ID " + bookId + " returned successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Test the functionality
        issueBook(101);
        returnBook(101);
    }
}
