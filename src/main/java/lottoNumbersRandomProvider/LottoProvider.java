package lottoNumbersRandomProvider;

import config.LottoConfig;

import java.security.SecureRandom;
import java.util.*;
import java.util.stream.Collectors;

import static config.LottoConfig.numbers_size;
import static config.LottoConfig.upper_bound;

public class LottoProvider {

    public Set<Integer> getGeneratedNumbers() {
        SecureRandom secureRandom = new SecureRandom();
        return secureRandom.ints(numbers_size,1,upper_bound+1).boxed().collect(Collectors.toSet());
    }
}
