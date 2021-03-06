package pl.coderslab.app.Author;

import java.util.List;

public interface AuthorService {
    void saveAutor(Author author);

    Author findById(long id);

    void update(Author author);

    void delete(long id);

    List<Author> findAll();

}
