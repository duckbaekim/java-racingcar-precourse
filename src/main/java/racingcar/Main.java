package racingcar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String carNames = scanner.nextLine();

        int numberOfMoves =  scanner.nextInt();
        System.out.println(numberOfMoves);
    }
}
