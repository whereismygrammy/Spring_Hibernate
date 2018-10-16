package pl.coderslab.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.coderslab.app.Author.Author;
import pl.coderslab.app.Author.AuthorService;

public class AuthorsConverter implements Converter<String, Author> {
    @Autowired
    AuthorService authorService;

    @Override
    public Author convert(String s) {
        return authorService.findById(Long.parseLong(s));
    }
}
