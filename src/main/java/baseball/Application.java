package baseball;

import baseball.domain.NumberGenerator;
import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        NumberGenerator generator = new NumberGenerator();
        List<Integer> computerNumbers = generator.createRandomNumber();
        List<Integer> playerNumbers = InputNumber();
        //System.out.println(playerNumbers);
    }
    public static List<Integer> InputNumber(){
        System.out.println("숫자 야구 게임을 시작합니다.");
        System.out.print("숫자를 입력해주세요 : ");
        String input = Console.readLine();
        List<Integer> InputNumbers = new ArrayList<>();
        for(String number : input.split("")){
            InputNumbers.add(Integer.parseInt(number));
        }
        return InputNumbers;
    }
}