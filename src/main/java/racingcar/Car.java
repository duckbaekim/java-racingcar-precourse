package racingcar;

public class Car {


    public static final int DEFAULT_POSITION = 0;
    private String name;
    private int position;

    public Car(String name){
        this.name =name;
        this.position = DEFAULT_POSITION;
    }

    public void move() {
        this.position++;
    }

    public int getPosition() {
        return this.position;
    }
}
