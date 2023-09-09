package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> carList(Integer count) {
        List<Car> carList;{
            carList = new ArrayList<>();
            carList.add(new Car("Toyota", "Window", 2003));
            carList.add(new Car("Honda", "Prelude", 2011));
            carList.add(new Car("Nissan", "President", 2008));
            carList.add(new Car("Suzuki", "Escudo", 2017));
            carList.add(new Car("Subaru", "LegacyB4", 2010));
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
