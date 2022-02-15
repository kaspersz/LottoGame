package lottoNumbersRandomProvider;

import config.LottoConfig;

import java.security.SecureRandom;
import java.util.*;
import java.util.stream.Collectors;

import static config.LottoConfig.numbers_size;
import static config.LottoConfig.upper_bound;

public class LottoProvider {

    public Set<Integer> getGeneratedNumbers() {
        Set<Integer> generatedNumbers = new HashSet<>();
        Random random = new Random();
        while(generatedNumbers.size()!=numbers_size)
        {
            generatedNumbers.add(1 + random.nextInt(48));
        }
        return generatedNumbers;
    }
}

