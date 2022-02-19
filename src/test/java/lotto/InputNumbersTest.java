package lotto;

import java.util.Set;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class InputNumbersTest implements InputNumbers {
    @Override
    public Set<Integer> getNumbers() {
        return Set.of(1, 2, 3, 4, 5, 6);
    }
}
