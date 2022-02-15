import logic.LottoCheckResult;
import lottoInput.LottoInput;
import lottoNumbersRandomProvider.LottoProvider;
import model.Game;
import model.LottoGame;

public class App {
    public static void main(String[] args) {
        Game lottoGame = getLottoGame();
        System.out.println(lottoGame.startGame().getResultInfo());

    }
    private static Game getLottoGame(){
        LottoInput lottoInput = new LottoInput();
        LottoProvider lottoProvider = new LottoProvider();
        LottoCheckResult lottoCheckResult = new LottoCheckResult();

        return new LottoGame(lottoInput, lottoProvider, lottoCheckResult);
    }
}
