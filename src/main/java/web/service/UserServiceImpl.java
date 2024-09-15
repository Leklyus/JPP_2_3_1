package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.models.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired(required = false)
    private UserDao userDao;

//    public UserServiceImpl(UserDao userDao) {
//        this.userDao = userDao;
//    }

    @Transactional
    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> getUsers() {
        return userDao.getUsers();
    }

//    @Transactional(readOnly = true)
//    @Override
//    public List<User> getUser(Long id) {
//        return userDao.getUser(id);
//    }

}
