package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ValidationUtilsTest {
    @Test
    @DisplayName("차 이름 검증")
    void valid_car_name() {
        assertThat(ValidationUtils.validCarName("a")).isTrue();
        assertThat(ValidationUtils.validCarName("aasdf")).isTrue();
        assertThat(ValidationUtils.validCarName("aasdfd")).isFalse();
    }

}
