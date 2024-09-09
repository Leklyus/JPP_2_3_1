package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Blue", "v6", "Toyota"));
        cars.add(new Car("Red", "v8", "Dodge"));
        cars.add(new Car("Green", "v4", "Honda"));
        cars.add(new Car("White", "v6", "Ford"));
        cars.add(new Car("Black", "v10", "Pontiac"));

    }

    @Override
    public List<Car> getCars() {
        return cars;
    }

    @Override
    public List<Car> getNCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }

}
