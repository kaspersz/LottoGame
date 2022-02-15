package lottoResults;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.*;

class LottoResultTest {

    @Test
    void shouldReturnCorrectMessageOnceTheGameIsFinished(){
        //given
        LottoResult lottoResult = new LottoResult(2);
        //when
        //then
        assertThat(lottoResult.getResultInfo(), equalTo("You have guessed 2 numbers"));

    }

}