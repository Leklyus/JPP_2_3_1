package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.UserServiceImpl;

@Controller
public class CarsController {

    private final UserServiceImpl carService;

    @Autowired
    public CarsController(UserServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/")
    public String printCars(@RequestParam(value = "count", required = false, defaultValue = "-1") int count, ModelMap model) {
        model.addAttribute("cars", (count < 0) ? carService.getCars() : carService.getNCars(count));
        return "index";

    }
}
