package pl.coderslab.app.Person;

import java.util.List;

public interface PersonService {

    void savePerson(Person person);

    Person findById(long id);

    void update(Person person);

    void delete(long id);

    public List<Person> findAll();


}
