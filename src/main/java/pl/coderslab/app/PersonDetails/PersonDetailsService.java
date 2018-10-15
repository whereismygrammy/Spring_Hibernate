package pl.coderslab.app.PersonDetails;

public interface PersonDetailsService {
    void savePersonDetails(PersonDetails personDetails);

    PersonDetails findById(long id);

    void update(PersonDetails personDetails);

    void delete(long id);
}
