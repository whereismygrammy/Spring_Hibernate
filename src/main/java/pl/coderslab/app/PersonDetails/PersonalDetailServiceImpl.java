package pl.coderslab.app.PersonDetails;

import javax.persistence.PersistenceContext;

public class PersonalDetailServiceImpl implements PersonDetailsService {
    @PersistenceContext
    PersonDetailsDao personDetailsDao;

    @Override
    public void savePersonDetails(PersonDetails personDetails) {
        personDetailsDao.savePersonDetails(personDetails);
    }

    @Override
    public PersonDetails findById(long id) {
        return personDetailsDao.findById(id);
    }

    @Override
    public void update(PersonDetails personDetails) {
        personDetailsDao.update(personDetails);
    }

    @Override
    public void delete(long id) {
        personDetailsDao.delete(id);
    }
}
