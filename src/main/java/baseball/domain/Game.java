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
            return "낫싱";
        }  else if (ball == 0) {
            return strike + "스트라이크";
        } else if (strike == 0) {
            return ball + "볼 ";
        } else {
            return ball + "볼 " + strike + "스트라이크";
        }
    }
}
