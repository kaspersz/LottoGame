package logic;

import lottoInput.LottoInput;
import lottoNumbersRandomProvider.LottoProvider;
import lottoResults.LottoResult;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LottoCheckResult {

    public LottoResult getResultOfTheGame(Set<Integer> inputNumbers, Set<Integer> generatedNumbers){

         Set<Integer> results = inputNumbers;
         results.retainAll(generatedNumbers);
        return new LottoResult(results.size());
    }
}
