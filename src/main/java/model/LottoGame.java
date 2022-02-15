package model;

import logic.LottoCheckResult;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lottoInput.LottoInput;
import lottoNumbersRandomProvider.LottoProvider;
import lottoResults.LottoResult;

import java.util.Scanner;

import static lottoMsgs.LottoMessages.initial_msg;

@AllArgsConstructor
public class LottoGame implements Game {

    LottoInput lottoInput;
    LottoProvider lottoProvider;
    LottoCheckResult lottoCheckResult;


    @Override
    public LottoResult startGame() {
        System.out.println(initial_msg);
        Scanner sc = new Scanner(System.in);
        LottoResult lottoResult = lottoCheckResult.getResultOfTheGame(lottoInput.getNumbersFromPlayer(sc), lottoProvider.getGeneratedNumbers());
        return lottoResult;
    }

}
