package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {

    @Test
    @DisplayName("자동차 이동 테스트")
    void go_car(){
        Car car = new Car("inqu");
        car.move(4);
        assertEquals(car.getPosition(), 1);
        car.move(6);
        assertEquals(car.getPosition(), 2);
        car.move(2);
        assertEquals(car.getPosition(), 2);
    }
    @Test
    @DisplayName("포지션 출력 테스트")
    void print_position(){
        Car car = new Car("inqu");
        car.move(6);
        String bar = car.printPosition();
        assertEquals(bar, "-");
        car.move(6);
        String bar2 = car.printPosition();
        assertEquals(bar2, "--");
    }
}


