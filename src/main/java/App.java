import lotto.LottoGameStarter;
import lotto.LottoResult;

public class App {

    public static void main(String[] args) {
        LottoGameStarter lottoGameStarter = new LottoGameStarter();
        LottoResult lottoResult = lottoGameStarter.startLotto();
        System.out.println(lottoResult);
    }


}
