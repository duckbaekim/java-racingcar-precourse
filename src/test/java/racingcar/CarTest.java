package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    @Test
    @DisplayName("자동차 이동 테스트")
    void go_car(){
        Car car = new Car("inqu");
        car.move();
        assertEquals(car.getPosition(), 1);
        car.move();
        assertEquals(car.getPosition(), 2);
    }
}


