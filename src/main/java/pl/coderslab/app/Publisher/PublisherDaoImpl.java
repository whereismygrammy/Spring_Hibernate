package pl.coderslab.app.Publisher;

import org.springframework.stereotype.Repository;
import pl.coderslab.app.Author.Author;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class PublisherDaoImpl implements PublisherDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void savePublisher(Publisher publisher) {
        entityManager.persist(publisher);

    }

    @Override
    public Publisher findById(long id) {
        return entityManager.find(Publisher.class, id);
    }

    @Override
    public void update(Publisher publisher) {
        entityManager.merge(publisher);
    }

    @Override
    public void delete(long id) {
        Publisher publisher = findById(id);
        entityManager.remove(publisher);

    }

    @Override
    public List<Publisher> findAll() {
        Query query = entityManager.createQuery("select p from Publisher p");
        return query.getResultList();
    }
}
