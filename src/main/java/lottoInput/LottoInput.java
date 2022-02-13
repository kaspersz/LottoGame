package lottoInput;


import lombok.Data;

import java.util.*;

import static lottoMsgs.LottoMessages.range;

@Data
public class LottoInput {


    public Set<Integer> getNumbersFromPlayer(Scanner sc) {
        Set playersNumber = new HashSet<>();
        while (playersNumber.size() != 6) {
            System.out.println("Please put " + (playersNumber.size() + 1) + " number");
            int number = sc.nextInt();
                if (validateNumber(number)) {
                    playersNumber.add(number);
                }
                else {
                    System.out.println(range);
                }
        }
        return playersNumber;
    }

    public boolean validateNumber(int number) {
        if (number > 0 && number < 50) {
            return true;
        }
        return false;
    }


}
