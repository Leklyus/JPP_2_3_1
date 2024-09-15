package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.UserService;

@Controller
public class UsersController {

    private final UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/")
    public String getUsers(ModelMap model) {
        model.addAttribute("users", userService.getUsers());
        return "index";
    }

//    @GetMapping("/{id}")
//    public String showUser(@RequestParam(value = "id") Long id, ModelMap model) {
//        model.addAttribute("users", userService.getUser(id));
//        return "index";
//    }

//    @GetMapping(value = "/delete")
//    public String deleteUser(@RequestParam(value = "id") Long id, ModelMap model) {
//
//        model.addAttribute("users", userService.getUsers());
//        System.out.println("id: " + id);
//        return "index";
//    }
}
