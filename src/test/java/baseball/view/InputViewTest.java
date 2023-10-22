package baseball.view;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class InputViewTest {
    @Test
    @DisplayName("숫자 입력 문구를 출력받은 후, 게임 플레이어는 컴퓨터가 생각하고 있는 서로 다른 3개의 숫자를 입력합니다.")
    void 플레이어숫자입력() {
        String playerNumbers = "123";
        InputView inputView = new InputView();

        try {
            InputStream inputStream = new ByteArrayInputStream(playerNumbers.getBytes());
            System.setIn(inputStream);

            String actualInput = inputView.setGameInput();

            assertEquals(playerNumbers, actualInput);
        } catch (Exception e) {
        }
    }

    @Test
    @DisplayName("재시작 숫자 입력 문구를 출력받은 후, 게임 플레이어는 재시작하고 싶을 시 숫자 1, 종료를 원할 시 숫자 2를 입력합니다.")
    void 재시작숫자입력() {
        String restartNumber = "1";
        InputView inputView = new InputView();

        try {
            InputStream inputStream = new ByteArrayInputStream(restartNumber.getBytes());
            System.setIn(inputStream);

            String actualInput = inputView.setRestartInput();

            assertEquals(restartNumber, actualInput);
        } catch (Exception e) {
        }
    }
}