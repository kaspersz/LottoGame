package lottoResults;

import lombok.Getter;
import lottoInput.LottoInput;
import lottoNumbersRandomProvider.LottoProvider;

import java.util.Objects;
@Getter
public class LottoResult {
        private int result;

    public LottoResult(int result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LottoResult that = (LottoResult) o;
        return result == that.result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(result);
    }

    @Override
    public String toString() {
        return "LottoResult{" +
                "result=" + result +
                '}';
    }
}
