package lottoNumbersRandomProvider;

import java.security.SecureRandom;
import java.util.*;
import java.util.stream.Collectors;

public class LottoProvider {

    public Set<Integer> getGeneratedNumbers() {
        SecureRandom secureRandom = new SecureRandom();
        return secureRandom.ints(6,1,50).boxed().collect(Collectors.toSet());
    }
}
