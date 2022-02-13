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
@Getter
@Setter
@AllArgsConstructor
public class LottoGame implements Game{

    LottoInput lottoInput;
    LottoProvider lottoProvider;
    LottoCheckResult lottoCheckResult;


    @Override
    public LottoResult startGame(){
        System.out.println("The game is started, please follow below instructions");
        Scanner sc = new Scanner(System.in);
        return lottoCheckResult.getResultOfTheGame(lottoInput.getNumbersFromPlayer(sc), lottoProvider.getGeneratedNumbers());
    }

}
