package racingcar;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
            String carNames = scanner.nextLine();
            Cars cars = new Cars();
            cars.createCars(carNames);
            System.out.println("시도할 회수는 몇회인가요?");
            int numberOfMoves = scanner.nextInt();
            if (!ValidationUtils.isInputPossible(numberOfMoves)){
                System.out.println("시도할 회수는 1번 이상을 입력하세요.");
                return;
            }
            for(int i=0; i<numberOfMoves; i++){
                cars.moveAllCars();
            }
        }catch(Exception exception){
            System.out.println(exception.getMessage());
        }


    }
}
