package lottoResults;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lottoInput.LottoInput;
import lottoNumbersRandomProvider.LottoProvider;

import java.util.Objects;

import static lottoMsgs.LottoMessages.results;

@AllArgsConstructor
@Data
public class LottoResult {

    private int result;

    public String getResultInfo() {
        return String.format(results, result );
    }


}
