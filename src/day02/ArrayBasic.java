package day02;

import java.util.Arrays;

public class ArrayBasic {

    public static void main(String[] args) {

        // int n1 = [10, 20, 30]; -> js처럼 사용 불가!

        // 배열 객체 생성
        // 동종 모음 구조 (int는 int끼리, String은 String끼리...)
        int[] arr = new int[5];
        System.out.println("arr = " + arr);

        arr[0] = 50;
        arr[1] = 77;
        arr[2] = arr[0] + 20; // 70
        arr[3] = (int) 66.7;
        arr[4] = 100;
//        arr[5] = 50;
//        런타임 에러 (실행해야 에러 확인 가능) : ArrayIndexOutOfBoundsException
        
        // 배열의 길이 - 저장 데이터 개수
        // 자바의 배열은 immutable (불변성)
        // 방의 개수가 정해지면 영원히 바뀌지 않는다!
        System.out.printf("배열의 길이: %d\n", arr.length);

        // 배열 반복문 처리
        // fori 단축키
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d번 데이터 : %d\n", i+1, arr[i]);
        }
        
        // foreach문
        // iter 단축키
        System.out.println("===========================");

        for (int n : arr) {
            System.out.printf("데이터 : %d\n", n);
        }

        // 배열 내부 데이터 문자열로 출력
        System.out.println(Arrays.toString(arr));
    }
}
