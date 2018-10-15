package pl.coderslab.app.Person;

public interface PersonService {

    void savePerson(Person person);

    Person findById(long id);

    void update(Person person);

    void delete(long id);

}
