package pl.coderslab.app.Publisher;

public interface PublisherService {

    void savePublisher(Publisher publisher);

    Publisher findById(long id);

    void update(Publisher publisher);

    void delete(long id);
}
