/**
 * Main 클래스에서는 PlayGame 클래스로부터 인스턴스를 받아서 이를 실행한다.
 * 그리고 terminator 메서드의 결과를 이용하여 게임의 재시작, 종료 여부를 결정한다.
 */

public class Main {

    public static void main(final String[] args) {

        while (true) {
            // PlayGame playGame = new PlayGame();
            // playGame.PlayGame();
            if (Terminator.terminator()) {
                continue;
            } else {
                break;
            }
        }
    }
}