package racingcar;

public class ValidationUtils {

    public static final int MAX_NAME_LENGTH = 5;
    public static final int MIN_NAME_LENGTH = 0;


    public static boolean validCarName(String name) {
        int len = name.length();
        return len > MIN_NAME_LENGTH && len <= MAX_NAME_LENGTH;
    }
}
