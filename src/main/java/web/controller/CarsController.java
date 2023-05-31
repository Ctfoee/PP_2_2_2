package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.service.ServiceImpl;



@Controller
@RequestMapping("/cars")
public class CarsController {
    private final ServiceImpl service;

    @Autowired
    public CarsController(ServiceImpl service) {
        this.service = service;
    }


    @GetMapping("")
    public String getCars(@RequestParam(defaultValue = "5")  int count, ModelMap model) {
        model.addAttribute("cars", service.getCars(count));
        return "cars";
    }
}
