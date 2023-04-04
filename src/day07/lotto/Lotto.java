package day07.lotto;

import java.util.Arrays;

import static java.lang.Math.random;

public class Lotto {

    private static int[] lotto = new int[6];

    private static void makeLotto() {
        int i = 0;
        while (i < lotto.length) {
            // 1 ~ 45 범위의 랜덤정수
            int rn = (int) (Math.random() * 45 + 1);
            if (!isDuplicate(lotto, rn)){
                lotto[i] = rn;
                i++;
            }
        }
    }

    public static void information() {
        makeLotto();
        System.out.println(Arrays.toString(lotto));
    }


    protected static int[] getLotto() {
        makeLotto();
        return lotto;
    }


    /**
     * 숫자가 이미 배열 안에 존재하는지 검사
     * @param targetLotto : 검사할 배열
     * @param rn : 검사할 숫자
     * @return : 배열에 숫자가 존재하면 true, 없으면 false
     */
    protected static boolean isDuplicate(int[] targetLotto, int rn) {
        for (int n : targetLotto) {
            if (rn == n) return true;
        }
        return false;
    }


}
