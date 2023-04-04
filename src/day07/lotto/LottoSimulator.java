package day07.lotto;

import java.util.Arrays;

import static day07.Util.Utility.*;
import static java.lang.Integer.parseInt;
import static java.lang.System.out;
import static java.util.Arrays.sort;

public class LottoSimulator extends Lotto {

    protected static int[] myLotto;
    protected static int n;
    
    private static int[] makeMyLotto() {
        // 나의 번호
        out.println("구매번호를 6개 차례대로 입력하세요.");
        myLotto = new int[6];
        int i = 0;
        while (i < myLotto.length) {
            int number = parseInt(input(String.format("%d번째 번호 >> ", i+1)));

            if(!Lotto.isDuplicate(myLotto, number)) {
                if(number < 1 || number > 45) {
                    out.println("# 1부터 45까지의 숫자를 작성해주세요!");
                    continue;
                }
                myLotto[i] = number;
                i++;
            } else {
                out.println("# 중복번호입니다.");
            }
        }
        return myLotto;
    }

    // 로또 번호 검사
    public static int checkLotto(int[] winNumbers, int[] myLotto) {
        int count = 0; // 일치한 숫자의 수
        for (int n : winNumbers) {
            for (int rn: myLotto) {
                if (rn == n) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void run() {
        // 1등 당첨번호
        int[] winNumbers = makeMyLotto();

        int paper = 0; // 구매한 장수
        while (true) {
            int[] purchasedLottoNumbers = Lotto.getLotto();
            paper++;

            int count = checkLotto(winNumbers, purchasedLottoNumbers);


            if (count == 6) {
                System.out.printf("# %d장만에 1등에 당첨되었습니다. ㅊㅋㅊㅋ\n", paper);
                break;
            } else {
                System.out.printf("# %d장째 구매중... ㅠㅠ\n", paper);
            }
        }
    }

}
