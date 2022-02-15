package lottoNumbersRandomProvider;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class LottoProviderTest {

    @Test
    void theSetOfRandomNumbersShouldReturnTheSizeOf6(){
        //given
        LottoProvider provider = new LottoProvider();
        //when
        //then
        assertThat(provider.getGeneratedNumbers().size(), equalTo(6));
    }


    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    void theSetOfRandomNumbersShouldReturnFalseIfSizeOfSetIsOtherThan6(int number){
        //given
        LottoProvider provider = new LottoProvider();
        //when
        //then
        assertThat(provider.getGeneratedNumbers().size(),not(equalTo(number)));
    }

    @Test
    void numbersInTheRandomGeneratedNumbersSetShouldBeBetween1and49(){
        //given
        LottoProvider provider = new LottoProvider();
        //when
        IntSummaryStatistics stats = provider.getGeneratedNumbers().stream().collect(Collectors.summarizingInt(Integer::intValue));
        int max = stats.getMax();
        int min = stats.getMin();
        //then
        assertThat(min, greaterThan(0));
        assertThat(max, lessThan(50));
    }

}