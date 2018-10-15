package pl.coderslab.app.Book;

import java.util.List;

public interface BookDao {

    void saveBook(Book book);

    Book findById(long id);

    void update(Book book);

    void delete(long id);

    List<Book> findAll();

    List<Book> getRatingList(int rating);
}
