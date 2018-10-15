package pl.coderslab.app.Author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@Service
public class AuthorServiceImp implements AuthorService {

    @Autowired
    AuthorDao authorDao;

    @Override
    public void saveAutor(Author author) {
        authorDao.saveAutor(author);
    }

    @Override
    public Author findById(long id) {
        return authorDao.findById(id);
    }

    @Override
    public void update(Author author) {
        authorDao.update(author);
    }

    @Override
    public void delete(long id) {
        authorDao.delete(id);
    }
}
