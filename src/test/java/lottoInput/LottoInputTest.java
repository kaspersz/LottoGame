package lottoInput;

import exceptions.NotANumberException;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.in;
import static org.junit.jupiter.api.Assertions.*;

class LottoInputTest {

    @Test
    void shouldReturnTheListOf6IntegersIfInputWasCorrect(){
        // given
        LottoInput input = new LottoInput();
        Scanner sc = mockScannerIn("1 2 3 4 5 6");
        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4,5,6));
        //when
        //then
        assertThat(input.getNumbersFromPlayer(sc), equalTo(set));


    }

    @Test
    void shouldReturnFalseWhenNumberIsOutOfRange(){
        //given
        LottoInput input = new LottoInput();
        int number = 60;
        //when
        //then
        assertFalse(input.validateNumber(String.valueOf(number)));
    }
    @Test
    void shouldReturnTrueWhenNumberIsInRange(){
        //given
        LottoInput input = new LottoInput();
        int number = 10;
        //when
        //them
        assertTrue(input.validateNumber(String.valueOf(number)));
    }
    @Test
    void shouldThrownNotANumberExceptionIfTheInputWasNotANumber(){
        LottoInput input = new LottoInput();
        String in = "z";
        assertThrows(NotANumberException.class, () -> input.validateNumber(in));
    }

    private Scanner mockScannerIn(String data) {
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        Scanner scanner = new Scanner(System.in);
        System.setIn(stdin);
        return scanner;
    }
}