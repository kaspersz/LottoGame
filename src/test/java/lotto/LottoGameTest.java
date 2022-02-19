package lotto;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class LottoGameTest {

    @Test
    public void should_return_correct_result() {
        // given
        LottoInput lottoInput = new LottoInput(new InputNumbersTest());
        LottoProvider lottoProvider = new LottoProvider();
        LottoResultChecker lottoCheckResult = new LottoResultChecker();
        LottoGame lottoGame = new LottoGame(lottoInput, lottoProvider, lottoCheckResult);

        // when
        LottoResult result = lottoGame.getResult();

        // then
        assertThat(result).isEqualTo(new LottoResult(6));
    }

}
