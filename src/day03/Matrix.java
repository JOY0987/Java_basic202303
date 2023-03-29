package day03;

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

        System.out.println(classScores[0][2] - classScores[1][1]); // 30-34 = -4


    }
}
