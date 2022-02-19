package lotto;

import java.util.Scanner;

public class LottoGameStarter {

    public LottoResult startLotto() {
        LottoInput lottoInput = new LottoInput(new InputNumbersLoop(new Scanner(System.in)));
        LottoProvider lottoProvider = new LottoProvider();
        LottoResultChecker lottoCheckResult = new LottoResultChecker();
        LottoGame lottoGame = new LottoGame(lottoInput, lottoProvider, lottoCheckResult);
        return lottoGame.getResult();
    }
}
