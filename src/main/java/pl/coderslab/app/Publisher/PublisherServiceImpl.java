package pl.coderslab.app.Publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class PublisherServiceImpl implements PublisherService {

    @Autowired
    PublisherDao publisherDao;

    @Override
    public void savePublisher(Publisher publisher) {
        publisherDao.savePublisher(publisher);
    }

    @Override
    public Publisher findById(long id) {
        return publisherDao.findById(id);
    }

    @Override
    public void update(Publisher publisher) {
        publisherDao.update(publisher);
    }

    @Override
    public void delete(long id) {
        publisherDao.delete(id);
    }
}