package web.service;

import org.springframework.stereotype.Component;
import web.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class UserServiceImpl implements UserService {
    private List<User> users;

    {
        users = new ArrayList<>();

        users.add(new User(1, "Ivan", "Andreev"));
        users.add(new User(2, "Petr", "Bokov"));
        users.add(new User(3, "Semen", "Ligotov"));

    }

    @Override
    public List<User> getCars() {
        return users;
    }

    @Override
    public List<User> getNCars(int count) {
        return users.stream().limit(count).collect(Collectors.toList());
    }

}
