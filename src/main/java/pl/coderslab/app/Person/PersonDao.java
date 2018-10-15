package pl.coderslab.app.Person;

import pl.coderslab.app.Publisher.Publisher;

public interface PersonDao {

    void savePerson(Person person);

    Person findById(long id);
    void update(Person person);

    void delete(long id);
}
