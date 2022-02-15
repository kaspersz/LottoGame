package logic;

import lottoInput.LottoInput;
import lottoNumbersRandomProvider.LottoProvider;
import lottoResults.LottoResult;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LottoCheckResultTest {

    @Test
    void shouldReturnOneIfPlayerGuessedOneNumber(){
        //given
        LottoCheckResult lottoCheckResult = new LottoCheckResult();
        LottoInput lottoInput = new LottoInput();
        Set<Integer> randomNumbers = new HashSet<>(Arrays.asList(1,11,22,33,44,49));
        //when
        LottoResult lottoResult = lottoCheckResult.getResultOfTheGame(lottoInput.getNumbersFromPlayer(mockScannerIn("1 2 3 4 5 6")), randomNumbers);
        //then
        assertThat(lottoResult.getResult(), equalTo(1));

    }

    @Test
    void shouldReturnSixIfPlayerGuessedAllNumbers(){
        //given
        LottoCheckResult lottoCheckResult = new LottoCheckResult();
        LottoInput lottoInput = new LottoInput();
        Set<Integer> randomNumbers = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        //when
        LottoResult lottoResult = lottoCheckResult.getResultOfTheGame(lottoInput.getNumbersFromPlayer(mockScannerIn("1 2 3 4 5 6")), randomNumbers);
        //then
        assertThat(lottoResult.getResult(), equalTo(6));

    }
    private Scanner mockScannerIn(String data) {
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        Scanner scanner = new Scanner(System.in);
        System.setIn(stdin);
        return scanner;
    }
}