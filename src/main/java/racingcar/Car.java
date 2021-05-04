package racingcar;

public class Car implements Comparable<Car>{

    public static final int DEFAULT_POSITION = 0;
    public static final int MIN_MOVE_NUMBER = 3;
    public static final int MAX_MOVE_NUMBER = 10;

    private String name;
    private int position;


    public Car(String name) {
        if (!ValidationUtils.validCarName(name)) {
            throw new IllegalThreadStateException("이름은 5글자 이하로 입력하세요.");
        }
        this.name = name;
        this.position = DEFAULT_POSITION;
    }

    @Override
    public int compareTo(Car car) {
        return this.getPosition() - car.getPosition();
    }

    public void move(int number) {
        if (this.isMove(number)) {
            this.position++;
        }
    }

    public void printPosition() {
        System.out.println(this.name + " : " + this.positionToBar());
    }

    public String positionToBar() {
        return "-".repeat(this.position);
    }

    public int getPosition() {
        return this.position;
    }

    public String getName() {
        return this.name;
    }

    public boolean isMove(int number) {
        return number > MIN_MOVE_NUMBER && number < MAX_MOVE_NUMBER;
    }
}
