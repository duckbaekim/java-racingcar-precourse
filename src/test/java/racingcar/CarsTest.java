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
}
