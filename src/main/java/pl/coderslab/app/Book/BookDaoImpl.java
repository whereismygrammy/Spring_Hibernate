package pl.coderslab.app.Book;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void saveBook(Book book) {
        entityManager.persist(book);
    }

    @Override
    public Book findById(long id) {
        return entityManager.find(Book.class, id);
    }

    @Override
    public void update(Book book) {
        entityManager.merge(book);
    }

    @Override
    public void delete(long id) {
        Book book = findById(id);
        entityManager.remove(book);
    }

    @Override
    public List<Book> findAll() {
        Query query = entityManager.createQuery("select b from Book b");
        return query.getResultList();
    }

    @Override
    public List<Book> getRatingList(int rating) {
        Query query = entityManager.createQuery("select b from Book b where rating > :rating");
        query.setParameter("rating", rating);
        return query.getResultList();
    }
}