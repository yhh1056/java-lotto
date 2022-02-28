package lotto.domain.vo;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class LottoNumberTest {

    @ParameterizedTest(name = "number : {0}")
    @ValueSource(ints = {0, 46})
    @DisplayName("로또 번호는 1이상 45이하가 아니면 예외가 발생한다.")
    void throwExceptionWhenOutOfRange(int number) {
        assertThatIllegalArgumentException()
            .isThrownBy(() -> new LottoNumber(number))
            .withMessageMatching("로또 번호는 1이상 45이하이어야 한다.");
    }

    @ParameterizedTest(name = "number : {0}")
    @ValueSource(ints = {1, 45})
    @DisplayName("로또 번호는 1이상 45이하로 생성된다.")
    void createNumber(int number) {
        assertThat(new LottoNumber(number)).isNotNull();
    }

    @Test
    @DisplayName("숫자가 같으면 동등한 객체이다.")
    void equalsNumber() {
        assertThat(new LottoNumber(1)).isEqualTo(new LottoNumber(1));
    }
}