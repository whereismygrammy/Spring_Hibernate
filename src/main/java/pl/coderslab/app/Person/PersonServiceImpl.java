package pl.coderslab.app.Person;

import javax.persistence.PersistenceContext;

public class PersonServiceImpl implements PersonService {

    @PersistenceContext
    PersonDao personDao;

    @Override
    public void savePerson(Person person) {
        personDao.savePerson(person);

    }

    @Override
    public Person findById(long id) {
        return personDao.findById(id);
    }

    @Override
    public void update(Person person) {
        personDao.update(person);
    }

    @Override
    public void delete(long id) {
        personDao.delete(id);
    }
}
