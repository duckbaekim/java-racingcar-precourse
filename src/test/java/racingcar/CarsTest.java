package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class CarsTest {

    @Test
    @DisplayName("여러 자동차 이름 , 로 분리 생성")
    void split_car_name() {
        String[] testList = new String[]{"one", "two", "three"};
        String[] carNames = Cars.splitCarName("one,two,three");
        assertEquals(testList, carNames);
        String[] notCarNames = Cars.splitCarName("one,two,notThree");
        assertNotEquals(testList, notCarNames);
    }

    @Test
    @DisplayName("여러 자동차 이름으로 자동차 객체 생성")
    void create_cars() {
        Cars cars = new Cars();
        cars.createCars("one,two,three");
        List<Car> testCars = Arrays.asList(
                new Car("one"),
                new Car("two"),
                new Car("three"));

        assertNotEquals(cars, testCars);
    }

    @Test
    @DisplayName("모든 자동차 포지션 출력")
    void print_position_all_car(){
        Cars cars = new Cars();
        cars.createCars("one,two,three");
        int[] moves = ValidationUtils.getRandomNumber(5);
        for(int move : moves){
            System.out.println(move);
            cars.moveAllCars(move);
        }
    }

    @Test
    @DisplayName("모든 자동차 이동")
    void move_all_car(){
        Cars cars = new Cars();
        cars.createCars("one,two,three");
        int[] moves = ValidationUtils.getRandomNumber(5);
        for(int move : moves){
            System.out.println(move);
            cars.moveAllCars(move);
        }
    }
}
