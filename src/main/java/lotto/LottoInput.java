package lotto;


import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class LottoInput {

    private final InputNumbers inputNumbers;

    public Set<Integer> getNumbersFromPlayer() {
        return inputNumbers.getNumbers();
    }

}
