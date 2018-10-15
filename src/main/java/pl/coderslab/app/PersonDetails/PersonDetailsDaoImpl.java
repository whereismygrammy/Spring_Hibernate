package pl.coderslab.app.PersonDetails;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class PersonDetailsDaoImpl implements PersonDetailsDao {

    @PersistenceContext
    EntityManager entityManager;


    @Override
    public void savePersonDetails(PersonDetails personDetails) {
        entityManager.persist(personDetails);
    }

    @Override
    public PersonDetails findById(long id) {
        return entityManager.find(PersonDetails.class, id);
    }

    @Override
    public void update(PersonDetails personDetails) {
        entityManager.merge(personDetails);
    }

    @Override
    public void delete(long id) {
        PersonDetails personDetails = findById(id);
        entityManager.remove(personDetails);
    }
}
