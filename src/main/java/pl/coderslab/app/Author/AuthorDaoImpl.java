package pl.coderslab.app.Author;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class AuthorDaoImpl implements AuthorDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void saveAutor(Author author) {
        entityManager.persist(author);

    }

    @Override
    public Author findById(long id) {
        return entityManager.find(Author.class, id);
    }

    @Override
    public void update(Author author) {
        entityManager.merge(author);

    }

    @Override
    public void delete(long id) {
        Author autorToDelete = findById(id);
        entityManager.remove(autorToDelete);
    }

    @Override
    public List<Author> findAll() {
        Query query = entityManager.createQuery("select a from Author a");
        return query.getResultList();
    }
}
