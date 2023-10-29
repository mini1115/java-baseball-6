package baseball.domain;

import java.util.List;

public class Game {
    public String judge(List<Integer> computger, List<Integer> player) {
        CheckBall checkBall = new CheckBall();
        int correctBall = checkBall.CorrectBallNumber(computger, player);
        int strike = 0;
        for (int placeIndex = 0; placeIndex < computger.size(); placeIndex++) {
            if (checkBall.samePlaceNumCheck(computger, placeIndex, player.get(placeIndex))) {
                strike++;
            }
        }
        int ball = correctBall - strike;

        if (correctBall == 0) {
            System.out.println("낫싱");
        }
        return ball + " 볼 " + strike + " 스트라이크";
    }
}
