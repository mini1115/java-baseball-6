package baseball.domain;

public final class Validate {
    public static void NumberLengthException(String input){
        if(input.length()!=3){
            throw new IllegalArgumentException("3자리 수를 입력해주세요");
        }
    }
}
