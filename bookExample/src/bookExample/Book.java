package bookExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Book {
    private String title;
    private int pageCount;
    private String author;
    private String publicationDate;

    public Book(String title, int pageCount, String author, String publicationDate) {
        this.title = title;
        this.pageCount = pageCount;
        this.author = author;
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }
}
