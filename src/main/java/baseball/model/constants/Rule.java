package baseball.model.constants;

public enum Rule {
    GAME_NUMBERS_MIN_VALUE(1),
    GAME_NUMBERS_MAX_VALUE(9),
    GAME_NUMBERS_SIZE(3),

    GAME_WIN(3),

    RESTART_OPTION_MIN_VALUE(1),
    RESTART_OPTION_MAX_VALUE(2),
    RESTART_OPTION_SIZE(1),
    RESTART_OPTION(1);

    private final int value;

    Rule(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}