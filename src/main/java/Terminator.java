/**
 * Terminator 클래스에서는 static으로 만들어진 terminator메서드를 이용하여 게임을 새로 시작할 것인지, 종료할 것인지에 따른 결과를 반환한다.
 */

import java.util.Scanner;

public class Terminator {

    private static String playAgain;

    public static boolean terminator() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요. ");
            playAgain = scan.nextLine();
            if (playAgain.equals("1")) {
                return true;
            } else if (playAgain.equals("2")) {
                return false;
            } else {
                System.out.println("잘못입력했네요. 다시 입력해주세요. ");
                continue;
            }
        }
    }

}
