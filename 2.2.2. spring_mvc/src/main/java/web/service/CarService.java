package web.service;

import web.model.CarModel;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    public static List<CarModel> getCars(Integer number, List<CarModel> cars) {
        List<CarModel> list = new ArrayList<>();
        if(number == null || number > 5){
            for (int i = 0; i < 5; i++) {
                list.add(cars.get(i));
            }
        } else {
            for (int i = 0; i < number; i++) {
                list.add(cars.get(i));
            }
        }
        return list;
    }
}
