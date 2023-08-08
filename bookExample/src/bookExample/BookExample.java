package bookExample;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookExample {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Book1", 150, "Author1", "2021-01-01"));
        books.add(new Book("Book2", 200, "Author2", "2022-02-02"));
        books.add(new Book("Book3", 120, "Author3", "2023-03-03"));
        books.add(new Book("Book4", 250, "Author4", "2024-04-04"));
        books.add(new Book("Book5", 180, "Author5", "2025-05-05"));
        books.add(new Book("Book6", 300, "Author6", "2026-06-06"));
        books.add(new Book("Book7", 90, "Author7", "2027-07-07"));
        books.add(new Book("Book8", 220, "Author8", "2028-08-08"));
        books.add(new Book("Book9", 160, "Author9", "2029-09-09"));
        books.add(new Book("Book10", 170, "Author10", "2030-10-10"));

       
        Map<String, String> titleAuthorMap = books.stream()
                .collect(Collectors.toMap(Book::getTitle, Book::getAuthor));

        System.out.println("Title-Author Map: " + titleAuthorMap);

        
        List<Book> booksWithMoreThan100Pages = books.stream()
                .filter(book -> book.getPageCount() > 100)
                .collect(Collectors.toList());

        System.out.println("Books with more than 100 pages: " + booksWithMoreThan100Pages);
    }
}
