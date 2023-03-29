package day03;

import java.util.Arrays;

public class Matrix {

    public static void main(String[] args) {
        int korScore = 10;
        int mathScore = 20;
        int engScore = 30;

        int[] kimScores = {korScore, mathScore, engScore};
        int[] parkScores = {100, 34, 99};
        int[] hongScores = {10, 100, 11};
        // 학생이 nn명이라면...?
        // 2차원 배열을 이용해야 하는 이유!

        // 2차원 배열
        int[][] classScores = {kimScores, parkScores, hongScores};

        System.out.println(classScores[0]); // 주소값 출력 [I@58ceff1
        System.out.println(kimScores); // 위와 동일한 주소값

        System.out.println(classScores[0][0]); // 10
        System.out.println(kimScores[0]); // 10
        
        // 데이터 타입이 같으면 연산 가능
        System.out.println(classScores[0][2] - classScores[1][1]); // 30-34 = -4

        // 3개의 주소값 (kimScores, parkScores, hongScores)
        System.out.println(Arrays.toString(classScores));

        // 주소 내부 데이터 출력
        System.out.println(Arrays.deepToString(classScores));
        
        
        // 2차원 배열의 값 초기화
        int[][] arr2d = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90},
                {100, 200, 300}
        };
        System.out.println("=======================");
        System.out.println(arr2d[1][2]);

        int[] arr3 = arr2d[2]; // [I@43a25848

        // 2차원 배열의 순회
        for (int[] arr : arr2d) {
            for (int n : arr) {
                System.out.printf("%3d", n); // 숫자가 몇이든 3자리 맞춤
            }
            System.out.println(); // 줄바꿈
        }

        // 배열의 기본값
        // 정수배열은 0이 기본값, 실수는 0.0이 기본값
        // char배열은 공백( )이 기본값, 논리는 거짓이 기본값
        // 그 나머지는 전부 null이 기본값!
        int[] numbers = new int[5];
        System.out.println("=======================");
        System.out.println(Arrays.toString(numbers));

        // 5행 4열의 2차원 배열을 생성만 하고싶다?
        int[][] array2d = new int[5][4];

        // 2차원 배열의 수정
        // array2d
        array2d[1][3] = 100;
        array2d[2][1] = 55;
        array2d[3] = new int[] {9, 8, 7, 6}; // new int[] 입력 불가능
        System.out.println("=======================");
        for (int[] ints : array2d) {
            for (int anInt : ints) {
                System.out.printf("%3d ", anInt);
            }
            System.out.println();
        }

        // 3차원 배열
        // 배열로 4차원 이상 만드는건 자제하기
        int[][][] arr3d = {
                {
                        {10, 20},
                        {30, 40}
                },
                {
                        {50, 60},
                        {70, 80}
                },
                {
                        {90, 100},
                        {200, 300}
                }
        };

        System.out.println(arr3d[1][0][1]);

    }
}
