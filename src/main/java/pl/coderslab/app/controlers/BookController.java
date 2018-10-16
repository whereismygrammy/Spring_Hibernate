package pl.coderslab.app.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.app.Author.Author;
import pl.coderslab.app.Author.AuthorService;
import pl.coderslab.app.Book.Book;
import pl.coderslab.app.Book.BookService;
import pl.coderslab.app.Publisher.Publisher;
import pl.coderslab.app.Publisher.PublisherService;

import java.util.List;


@Controller
@RequestMapping("/books")
public class BookController {


    @Autowired
    BookService bookService;

    @Autowired
    PublisherService publisherService;

    @Autowired
    AuthorService authorService;

    @GetMapping("/save")
    @ResponseBody
    public String save() {

        Book book = new Book();
        book.setTitle("Tytul");

        Book book2 = new Book();
        book.setTitle("Tytul2");

        Book book3 = new Book();
        book.setTitle("Tytul3");

        book.setDescription("Opis");
        Publisher publisher = new Publisher();
        publisher.setName("Publisher name");
        publisherService.savePublisher(publisher);
        book.setPublisher(publisher);

        Author author = new Author();
        author.setFirstName("Imie");
        author.setLastName("Nazwisko");


        Author author2 = new Author();
        author2.setFirstName("2");
        author2.setLastName("2");


        authorService.saveAutor(author);
        authorService.saveAutor(author2);

        book.getAuthors().add(author);
        book.getAuthors().add(author2);

        book.setRating(5);
        book2.setRating(10);
        book3.setRating(8);

        bookService.saveBook(book);
        bookService.saveBook(book2);
        bookService.saveBook(book3);
        return "Dodawanie ksiazek";
    }


    @GetMapping("/find/{id}")
    @ResponseBody
    public String find(@PathVariable long id) {
        Book bookById = bookService.findById(id);
        return bookById.toString();

    }

    @GetMapping("/edit/{id}/{title}")
    @ResponseBody
    public String edit(@PathVariable long id, @PathVariable String title) {
        Book book1 = bookService.findById(id);
        book1.setTitle(title);
        bookService.update(book1);
        return book1.toString();
    }


    @GetMapping("/delete/{id}")
    @ResponseBody
    public String delete(@PathVariable long id) {
        if (bookService.findById(id) == null) {
            return "Nie ma takiej ksiażki";
        }
        bookService.delete(id);
        return "Usunieto ksiazke <a href='/books/list'>Wroc do listy</a>";
    }

    @GetMapping("/rating/{id}")
    @ResponseBody
    public String ratingList(@PathVariable int id) {
        List<Book> books = bookService.getRatingList(id);
        StringBuilder sb = new StringBuilder();

        for (Book b : books) {
            System.out.println(b);
            sb.append(b.toString()).append("<br>");
        }
        return sb.toString();
    }

    ///// 2 dzien /////

    @ModelAttribute("publishers")
    public List<Publisher> getPublishers() {
        return publisherService.findAll();
    }

    @ModelAttribute("books")
    public List<Book> getBooks() {
        return bookService.findAll();
    }

    @ModelAttribute("authors")
    public List<Author> getAuthors() {
        return authorService.findAll();
    }

    @GetMapping("/add")
    public String addBook(Model model) {
        model.addAttribute("book", new Book());
        return "book";
    }

    @PostMapping("/add")
    public String addBook(@ModelAttribute Book book) {
        bookService.saveBook(book);
        return "redirect:list";
    }

    @GetMapping("/list")
    public String findAll() {
        return "bookList";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable long id, Model model) {
        Book book = bookService.findById(id);
        model.addAttribute("bookToEdit", book);
        return "bookEdit";
    }

    @PostMapping("/edit/{id}")
    @ResponseBody
    public String edit(@ModelAttribute Book bookToEdit) {
        bookService.update(bookToEdit);
        return "<a href = '/books/list'>Wroc do listy </a>";
    }

}