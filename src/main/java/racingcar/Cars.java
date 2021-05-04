package racingcar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cars {
    private List<Car> cars;

    public static String[] splitCarName(String names) {
        return names.split(",");
    }

    public static List<Car> createCars(String names){
        String[] carNames = Cars.splitCarName(names);
        List<Car> cars = new ArrayList<>();
        for (String carName : carNames) {
            cars.add(new Car(carName));
        }
        return cars;
    }
}
