package pl.coderslab.app.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.app.Author.Author;
import pl.coderslab.app.Author.AuthorService;

@Controller
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    AuthorService authorService;


    @GetMapping("/save")
    @ResponseBody
    public String save() {
        Author author = new Author("Imie", "Nazwisko");
        authorService.saveAutor(author);
        return author.toString();
    }

    @GetMapping("/find/{id}")
    @ResponseBody
    public String find(@PathVariable long id) {
        Author author = authorService.findById(id);
        return author.toString();

    }

    @GetMapping("/edit/{id}/{name}")
    @ResponseBody
    public String edit(@PathVariable long id, @PathVariable String name) {
        Author author = authorService.findById(id);
        author.setFirstName(name);
        authorService.update(author);
        return author.toString();
    }

    @GetMapping("/delete/{id}")
    @ResponseBody
    public String delete(@PathVariable long id) {
        if (authorService.findById(id) == null) {
            return "Nie ma takiej ksiażki";
        }
        authorService.delete(id);
        return "Usunieto autora";
    }

}
