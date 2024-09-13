package web.dao;

import org.springframework.stereotype.Controller;
import web.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Controller
public class UserDaoImpl implements UserDao {

    //    @Autowired
//    private SessionFactory sessionFactory;
    @Autowired
    private EntityManager entityManager;

//    @Override
//    public void add(User user) {
////        sessionFactory.getCurrentSession().save(user);
//        entityManager.persist(user);
//    }

    @Transactional
    public void save(User user) {
        entityManager.persist(user);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<User> getUsers() {
//        TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User");
//        return query.getResultList();
        return null;
    }

}
