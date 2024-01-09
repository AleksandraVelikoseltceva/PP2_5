package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Repository
public class CarDaoImpl implements CarDao {
    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car(1, "model1", 1));
        carList.add(new Car(2, "model2", 2));
        carList.add(new Car(3, "model3", 3));
        carList.add(new Car(4, "model4", 4));
        carList.add(new Car(5, "model5", 5));
    }
    @Override
    public List<Car> getCars(Integer count) {
        if (count == 0) {
            return carList;
        }

        return carList.stream().limit(count).collect(Collectors.toList());
    }
}