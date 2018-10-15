package pl.coderslab.app.PersonDetails;

public interface PersonDetailsDao{

        void savePersonDetails(PersonDetails personDetails);

        PersonDetails findById(long id);

        void update(PersonDetails personDetails);

        void delete(long id);



}
