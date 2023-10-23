package baseball.view;

import static baseball.model.constants.GameConstants.GAME_INPUT_PHRASE;
import static baseball.model.constants.GameConstants.GAME_RESTART_PHRASE;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public static String setGameInput() {
        System.out.print(GAME_INPUT_PHRASE);
        return Console.readLine();
    }

    public static String setRestartInput() {
        System.out.println(GAME_RESTART_PHRASE);
        return Console.readLine();
    }
}
