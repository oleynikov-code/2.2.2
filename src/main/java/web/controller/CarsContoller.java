package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarsContoller {
    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public String printCarsList(@RequestParam(value = "count", defaultValue = "5") int count, Model model){
        model.addAttribute("carsList",carService.getCarList(count));
        return "cars";
    }
}