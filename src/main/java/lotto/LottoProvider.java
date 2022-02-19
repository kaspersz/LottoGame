package lotto;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import static lotto.LottoConfig.numbers_size;

class LottoProvider {

    public Set<Integer> getGeneratedNumbers() {
        Set<Integer> generatedNumbers = new HashSet<>();
        Random random = new Random();
        while (generatedNumbers.size() != numbers_size) {
            generatedNumbers.add(1 + random.nextInt(48));
        }
        return generatedNumbers;
    }
}

