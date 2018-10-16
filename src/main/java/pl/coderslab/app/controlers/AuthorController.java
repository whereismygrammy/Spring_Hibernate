package pl.coderslab.app.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.app.Author.Author;
import pl.coderslab.app.Author.AuthorService;
import pl.coderslab.app.Book.Book;
import pl.coderslab.app.Book.BookService;

import java.util.List;

@Controller
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    AuthorService authorService;

    @Autowired
    BookService bookService;


    @ModelAttribute("authors")
    public List<Author> getAuthors() {
        return authorService.findAll();
    }

    @ModelAttribute("books")
    public List<Book> getBooks() {
        return bookService.findAll();
    }

    @GetMapping("/list")
    public String findAll() {
        return "authorList";
    }


    @GetMapping("/add")
    public String addAuthor(Model model) {
        model.addAttribute("author", new Author());
        return "authorAdd";
    }

    @PostMapping("/add")
    public String addAuthor(@ModelAttribute Author author) {
        authorService.saveAutor(author);
        return "redirect:list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable long id) {
        if (authorService.findById(id) == null) {
            return "Nie ma takiego autora";
        }
        authorService.delete(id);
        return "redirect:../list";
    }

    @GetMapping("/edit/{id}")
    public String editAuthor(@PathVariable long id, Model model) {
        Author author = authorService.findById(id);
        model.addAttribute("author", author);
        return "authorAdd";
    }

    @PostMapping("/edit/{id}")
    public String editAuthor(@ModelAttribute Author author) {
        authorService.update(author);
        return "redirect:../list";
    }


    @GetMapping("/find/{id}")
    @ResponseBody
    public String find(@PathVariable long id) {
        Author author = authorService.findById(id);
        return author.toString();

    }

}
