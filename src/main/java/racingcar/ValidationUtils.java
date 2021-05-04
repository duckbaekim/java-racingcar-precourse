package racingcar;

import java.util.Random;

public class ValidationUtils {

    public static final int MAX_NAME_LENGTH = 5;
    public static final int MIN_NAME_LENGTH = 0;
    public static final int MIN_INPUT = 1;


    public static boolean validCarName(String name) {
        int len = name.length();
        return len > MIN_NAME_LENGTH && len <= MAX_NAME_LENGTH;
    }

    public static int[] getRandomNumber(int randomSize) {
        Random random = new Random();
        int[] result = new int[randomSize];
        for (int i = 0; i < randomSize; i++) {
            result[i] = random.nextInt(10) - 1;
        }
        return result;
    }

    public static boolean isInputPossible(int input) {
        return MIN_INPUT <= input;
    }
}
