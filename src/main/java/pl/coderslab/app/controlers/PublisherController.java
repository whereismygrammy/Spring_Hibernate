package pl.coderslab.app.controlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.app.Book.BookService;
import pl.coderslab.app.Publisher.Publisher;
import pl.coderslab.app.Publisher.PublisherService;

import java.util.List;

@Controller
@RequestMapping("/publisher")
public class PublisherController {

    @Autowired
    PublisherService publisherService;

    @Autowired
    BookService bookService;

    @GetMapping("/list")
    public String getList(Model model) {
        List<Publisher> publishers = publisherService.findAll();
        model.addAttribute("publishers", publishers);
        return "publisherList";
    }

    @GetMapping("/find/{id}")
    @ResponseBody
    public String find(@PathVariable long id) {
        Publisher publisher = publisherService.findById(id);
        return publisher.toString();
    }

    @GetMapping("/add")
    public String addPublisher(Model model) {
        model.addAttribute("publisher", new Publisher());
        return "publisherAdd";
    }

    @PostMapping("/add")
    public String addPublisher(@ModelAttribute Publisher publisher) {
        publisherService.savePublisher(publisher);
        return "redirect:list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable long id) {
        if (publisherService.findById(id) == null) {
            return "Nie ma takiego Publishera";
        }
        publisherService.delete(id);
        return "redirect:../list";
    }

    @GetMapping("/edit/{id}")
    public String editPublisher(@PathVariable long id, Model model) {
        Publisher publisher = publisherService.findById(id);
        model.addAttribute("publisher", publisher);
        return "publisherAdd";
    }

    @PostMapping("/edit/{id}")
    public String editPublisher(@ModelAttribute Publisher publisher) {
        publisherService.update(publisher);
        return "redirect:../list";
    }
}
