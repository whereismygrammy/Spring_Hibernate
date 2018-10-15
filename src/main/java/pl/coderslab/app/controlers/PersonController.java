package pl.coderslab.app.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/person")
public class PersonController {

//    @Autowired
//    PersonDetailsDao personDetailsDao;
//
//    @Autowired
//    PersonDaoImpl personDao;
//
//    @GetMapping("/save")
//    @ResponseBody
//    public String save() {
//
//        Person person = new Person();
//        person.setEmail("Mail");
//        person.setLogin("Login");
//
//        PersonDetails personDetails = new PersonDetails();
//
//        personDetails.setCity("Miasto");
//        personDetails.setFirstName("FirstName");
//        personDetails.setLastName("Nazwisko");
//        personDetails.setPerson(person);
//
//        person.setPersonDetails(personDetails);
//
//        personDao.savePerson(person);
//        return " Zapisano persona";
//    }

//
//    @GetMapping("/find/{id}")
//    @ResponseBody
//    public String find(@PathVariable long id) {
//        Book bookById = bookService.findById(id);
//        return bookById.toString();
//
//    }
//
//    @GetMapping("/edit/{id}/{title}")
//    @ResponseBody
//    public String edit(@PathVariable long id, @PathVariable String title) {
//        Book book1 = bookService.findById(id);
//        book1.setTitle(title);
//        bookService.update(book1);
//        return book1.toString();
//    }
//
//    @GetMapping("/delete/{id}")
//    @ResponseBody
//    public String delete(@PathVariable long id) {
//        if (bookService.findById(id) == null) {
//            return "Nie ma takiej ksiażki";
//        }
//        bookService.delete(id);
//        return "Usunieto książkę";
//    }
}
