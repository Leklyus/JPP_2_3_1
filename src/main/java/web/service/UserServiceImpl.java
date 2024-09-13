package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    {

//        users.add(new User("Ivan", "Andreev", (byte) 23));
//        users.add(new User("Petr", "Bokov", (byte) 34));
//        users.add(new User("Andrey", "Ligotov", (byte) 25));

        save(new User("User", "Customer", (byte) 25));

    }

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

}
