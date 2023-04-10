package day11.api.system;

import java.util.Arrays;

public class SystemExample {

    public static void main(String[] args) {
        
        // 운영체제의 현재 시간 읽기
        long time = System.currentTimeMillis(); // 밀리초로 현재 시간 반환
        System.out.println("time = " + time);

        // 코드
        // 프로그램 시작과 끝에 작성해서 실행 시간 측정 가능
        long time2 = System.currentTimeMillis();

        // 배열 카피
        int[] arr = {10, 20, 30};
        int[] copyArr = new int[arr.length];
        System.arraycopy(arr, 0, copyArr, 0, arr.length);
        // 카피할 배열, 시작 index, 붙여넣기할 배열, 시작 index, 복사할 index 개수
        System.out.println(Arrays.toString(copyArr));

    }
}
