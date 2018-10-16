package pl.coderslab.app.controlers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.app.PersonDTO.PersonDTO;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/persondto")
public class PersonDTOController {

    @ModelAttribute("countryItems")
    public List<String> contries() {
        String a[] = new String[]{"Polska", "Niemcy", "Anglia", "USA"};
        return Arrays.asList(a);
    }

    @ModelAttribute("programmingList")
    public List<String> programmingSkills() {
        String a[] = new String[]{"JAVA", "PHP", "ANGULAR"};
        return Arrays.asList(a);
    }

    @ModelAttribute("hobbiesList")
    public List<String> hobbies() {
        String a[] = new String[]{"Pilka", "Koszykowka", "Szachy"};
        return Arrays.asList(a);
    }

    @GetMapping("/add")
    public String addPerson(@ModelAttribute PersonDTO personDTO) {
        return "detailForm";
    }

    @PostMapping("/add")
    @ResponseBody
    public String getPerson(@ModelAttribute PersonDTO personDTO) {
        return personDTO.toString();
    }
}
