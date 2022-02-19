package lotto;

import java.util.Set;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class LottoGame implements Game {

    private final LottoInput lottoInput;
    private final LottoProvider lottoProvider;
    private final LottoResultChecker resultChecker;

    @Override
    public LottoResult getResult() {
        System.out.println(LottoMessages.initial_msg);
        Set<Integer> numbersFromPlayer = lottoInput.getNumbersFromPlayer();
        Set<Integer> generatedNumbers = lottoProvider.getGeneratedNumbers();
        return resultChecker.getResultOfTheGame(numbersFromPlayer, generatedNumbers);
    }

}
