package web.service;

import web.models.User;

import java.util.List;

public interface UserService {

    void save(User user);

    public List<User> getUsers();

//    public List<User> getUser(Long id);

}
