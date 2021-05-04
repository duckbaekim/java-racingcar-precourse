package racingcar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Cars {
    private List<Car> cars;

    public static String[] splitCarName(String names) {
        return names.split(",");
    }

    public void createCars(String names) {
        String[] carNames = Cars.splitCarName(names);
        List<Car> cars = new ArrayList<>();
        for (String carName : carNames) {
            cars.add(new Car(carName));
        }
        this.cars = cars;
    }

    public void moveAllCars() {
        for (Car car : this.cars) {
            car.move(ValidationUtils.getRandomNumber());
            car.printPosition();
        }
    }

    public void sortCars() {
        Collections.sort(cars);
    }

    public boolean comparePosition(Car car) {
        return car.getPosition() == cars.get(0).getPosition();
    }

    public String getWinner(Car car) {
        if (comparePosition(car)) {
            return car.getName();
        }
        return "";
    }

    public String checkWinner() {
        sortCars();
        String winner = "";
        int idx = 0;
        for (Car car : this.cars) {
            winner += (idx == 0 ? getWinner(car) : ", " + getWinner(car));
            idx++;
        }
        return winner;
    }


}
