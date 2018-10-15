package pl.coderslab.app.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookDao bookDao;

    @Override
    public void saveBook(Book book) {
        bookDao.saveBook(book);
    }

    @Override
    public Book findById(long id) {
        return bookDao.findById(id);
    }

    @Override
    public void update(Book book) {
            bookDao.update(book);
    }

    @Override
    public void delete(long id) {
        bookDao.delete(id);
    }

    @Override
    public List<Book> findAll() {
        return bookDao.findAll();
    }

    @Override
    public List<Book> getRatingList(int rating) {
        return bookDao.getRatingList(rating);
    }
}
