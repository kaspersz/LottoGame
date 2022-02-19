package lotto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class LottoResult {

    private int result;

    public String getResultInfo() {
        return String.format(LottoMessages.results, result);
    }

}
