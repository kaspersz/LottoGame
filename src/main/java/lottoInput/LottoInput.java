package lottoInput;


import exceptions.NotANumberException;
import lombok.Data;

import java.util.*;

import static config.LottoConfig.lower_bound;
import static config.LottoConfig.upper_bound;
import static lottoMsgs.LottoMessages.out_of_range;

@Data
public class LottoInput {


    public Set<Integer> getNumbersFromPlayer(Scanner sc) {
        Set playersNumber = new HashSet<>();
        while (playersNumber.size() != 6) {
            System.out.println("Please put " + (playersNumber.size() + 1) + " number");
            String number = sc.next();
                if (validateNumber(number)) {
                    playersNumber.add(Integer.valueOf(number));
                }
                else {
                    System.out.println(out_of_range);
                }
        }
        return playersNumber;
    }

    public boolean validateNumber(String number) {
        if(!number.matches("[0-9]+")){
            throw new NotANumberException();
        }
        if (Integer.valueOf(number) >= lower_bound  && Integer.valueOf(number) <= upper_bound) {
            return true;
        }
        return false;
    }


}
