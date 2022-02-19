package lotto;

import java.util.Set;

class LottoResultChecker {

    public LottoResult getResultOfTheGame(Set<Integer> inputNumbers, Set<Integer> generatedNumbers) {
        System.out.printf((LottoMessages.show_input_and_random_numbers) + "%n", inputNumbers, generatedNumbers);
        inputNumbers.retainAll(generatedNumbers);
        return new LottoResult(inputNumbers.size());
    }

}
