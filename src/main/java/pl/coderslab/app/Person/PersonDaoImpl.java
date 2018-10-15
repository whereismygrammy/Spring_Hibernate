package pl.coderslab.app.Person;


import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class PersonDaoImpl implements PersonDao {


    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void savePerson(Person person) {
        entityManager.persist(person);


    }

    @Override
    public Person findById(long id) {
        return entityManager.find(Person.class, id);
    }

    @Override
    public void update(Person person) {
        entityManager.merge(person);

    }

    @Override
    public void delete(long id) {
        Person person = findById(id);
        entityManager.remove(person);
    }

    @Override
    public List<Person> findAll() {
        Query query = entityManager.createQuery("select p from Person p");
        return query.getResultList();

    }
}
