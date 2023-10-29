package baseball.domain;

import java.util.List;

public class CheckBall {
    //몇개의 숫자가 일치하는지
    public int CorrectBallNumber(List<Integer> computer,List<Integer> player){
        int result = 0;
        for(int i=0;i<computer.size();i++){
            if(computer.contains(player.get(i))){
                result ++;
            }
        }
        return result;
    }
}
