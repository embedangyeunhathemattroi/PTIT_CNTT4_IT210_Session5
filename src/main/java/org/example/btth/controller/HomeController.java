package org.example.btth.controller;


import org.example.btth.model.Dish;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping
public class HomeController {
    List<Dish> dishes = new ArrayList<>(
            Arrays.asList(
                    new Dish(1, "ca ran", 12000.0, 10),
                    new Dish(2, "xien ban", 12000.0, 20),
                    new Dish(3, "lon quay", 12000.0, 30),
                    new Dish(4, "nem chua", 12000.0, 40)
            )
    );
    @GetMapping("/home")
    public String home(Model model){
        model.addAttribute("monAn", dishes);
        return "home";
    }

}
