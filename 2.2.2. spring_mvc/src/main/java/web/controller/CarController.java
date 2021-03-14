package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.CarModel;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/car")
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(Model model, @RequestParam(value = "count", required = false) Integer count){
        List<CarModel> cars = new ArrayList<>();
        cars.add(new CarModel(1, "DMV", 8, 2007));
        cars.add(new CarModel(2, "AUEDI", 2, 2010));
        cars.add(new CarModel(3, "VOBLO", 1, 2008));
        cars.add(new CarModel(4, "GAZENWAGEN", 14, 1940));
        cars.add(new CarModel(5, "OPlUM", 3, 1990));
        model.addAttribute("cars", CarService.getCars(count, cars));
        return "cars";
    }


}
