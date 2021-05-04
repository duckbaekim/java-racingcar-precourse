package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidationUtilsTest {
    public static final int MIN_RANDOM_NUMBER = 1;
    public static final int MAX_RANDOM_NUMBER = 9;

    @Test
    @DisplayName("차 이름 검증")
    void valid_car_name() {
        assertThat(ValidationUtils.validCarName("a")).isTrue();
        assertThat(ValidationUtils.validCarName("aasdf")).isTrue();
        assertThat(ValidationUtils.validCarName("aasdfd")).isFalse();
    }

    @Test
    @DisplayName("랜덤 숫자 테스트")
    void valid_random_number() {
        int[] randomNumbers = ValidationUtils.getRandomNumber(5);
        assertEquals(randomNumbers.length, 5);
        for (int randomNumber : randomNumbers) {
            assertThat(randomNumber >= MIN_RANDOM_NUMBER && randomNumber <= MAX_RANDOM_NUMBER).isTrue();
        }
    }


}
