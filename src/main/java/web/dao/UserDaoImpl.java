package web.dao;

import org.springframework.stereotype.Controller;
import web.models.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Controller
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;


    @Transactional
    public void save(User user) {
        entityManager.persist(user);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> getUsers() {
        Query query = entityManager.createQuery("from User", User.class);
        return query.getResultList();
    }

//    @Override
//    @SuppressWarnings("unchecked")
//    public List<User> getUser(Long id) {
//        Query query = entityManager.createQuery("from User where id=:id");
//        query.setParameter("id", id);
//        return query.getResultList();
//    }

}
