package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ServiceImpl implements Service{

    private final List<Car> cars = List.of(new Car("BMV", 5, "Boba"),
            new Car("BMV", 6, "Bola"), new Car("BVM", 5, "Boba"),
            new Car("BVM", 6, "Bola"), new Car("BMV", 18, "Aboba"));

    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }

}
