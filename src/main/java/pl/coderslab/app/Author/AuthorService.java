package pl.coderslab.app.Author;

public interface AuthorService {
    void saveAutor(Author author);

    Author findById(long id);

    void update(Author author);

    void delete(long id);

}
