package lotto.domain;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

public class LottosFactoryTest {
    @Test
    void Money_1000원_미만_입력시_예외처리() {
        assertThatThrownBy(() -> {
            Integer inputMoney = 500;
            LottosFactory.createLottosAuto(new Money(inputMoney));
        }).isInstanceOf(IllegalArgumentException.class)
            .hasMessage("1000원 이상 입력해주세요.");
    }
}