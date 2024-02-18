package weekly4;

import static weekly4.Matching.isMatched;

public class Main4 {

    public static void main(String[] args) {
        String input1 = "())()";
        String input2 = "(()())";
        String input3 = "(()()(";

        System.out.println(isMatched(input1)); // 출력: false
        System.out.println(isMatched(input2)); // 출력: true
        System.out.println(isMatched(input3)); // 출력: false
    }
}
