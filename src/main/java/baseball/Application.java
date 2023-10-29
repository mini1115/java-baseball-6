package baseball;

import baseball.domain.Game;
import baseball.domain.NumberGenerator;
import baseball.domain.Validate;
import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        StartGame();
        EndGame();
    }

    public static void StartGame() {
        Game game = new Game();
        String result = "";
        NumberGenerator generator = new NumberGenerator();
        List<Integer> computerNumbers = generator.createRandomNumber();
        //System.out.println(computerNumbers);
        System.out.println("숫자 야구 게임을 시작합니다.");
        while (!result.equals("3스트라이크")) {
            List<Integer> playerNumbers = InputNumber();
            result = game.judge(computerNumbers, playerNumbers);
            System.out.println(result);
        }
    }

    public static void EndGame() {
        boolean returnGame = true;
        while (returnGame) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n" +
                    "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
            String input = Console.readLine();
            if (input.equals("1")) {
                StartGame();
            } else {
                returnGame = false;
            }
        }
    }

    public static List<Integer> InputNumber() {
        Validate validate = new Validate();
        System.out.print("숫자를 입력해주세요 : ");
        String input = Console.readLine();
        validate.NumberLengthException(input);
        List<Integer> InputNumbers = new ArrayList<>();
        for (String number : input.split("")) {
            InputNumbers.add(Integer.parseInt(number));
        }
        return InputNumbers;
    }
}