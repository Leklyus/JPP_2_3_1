package web.dao;

import web.models.User;

import java.util.List;

public interface UserDao {
    void save(User user);

    List<User> getUsers();

//    List<User> getUser(Long id);

}
