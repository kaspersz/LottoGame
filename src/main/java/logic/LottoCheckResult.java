package logic;

import lottoInput.LottoInput;
import lottoNumbersRandomProvider.LottoProvider;
import lottoResults.LottoResult;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static lottoMsgs.LottoMessages.show_input_and_random_numbers;

public class LottoCheckResult {

    public LottoResult getResultOfTheGame(Set<Integer> inputNumbers, Set<Integer> generatedNumbers) {
        System.out.println(String.format(show_input_and_random_numbers, inputNumbers, generatedNumbers));
        Set<Integer> results = inputNumbers;
        results.retainAll(generatedNumbers);

        return new LottoResult(results.size());
    }

}
