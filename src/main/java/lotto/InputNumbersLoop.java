package lotto;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import lombok.AllArgsConstructor;
import static lotto.LottoConfig.lower_bound;
import static lotto.LottoConfig.upper_bound;

@AllArgsConstructor
class InputNumbersLoop implements InputNumbers {

    Scanner scanner;

    @Override
    public Set<Integer> getNumbers() {
        Set<Integer> playersNumber = new HashSet<>();
        while (playersNumber.size() != 6) {
            System.out.println("Please put " + (playersNumber.size() + 1) + " number");
            String number = scanner.next();
            if (validateNumber(number)) {
                playersNumber.add(Integer.valueOf(number));
            } else {
                System.out.println(LottoMessages.out_of_range);
            }
        }
        return playersNumber;
    }

    public boolean validateNumber(String number) {
        if (!number.matches("[0-9]+")) {
            throw new NotANumberException();
        }
        if (Integer.valueOf(number) >= lower_bound && Integer.valueOf(number) <= upper_bound) {
            return true;
        }
        return false;
    }
}
