package pl.coderslab.app.Publisher;

import pl.coderslab.app.Author.Author;

import java.util.List;

public interface PublisherDao {

    void savePublisher(Publisher publisher);

    Publisher findById(long id);

    void update(Publisher publisher);

    void delete(long id);

    List<Publisher> findAll();

}
