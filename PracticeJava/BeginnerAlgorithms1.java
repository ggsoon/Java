// Do it! 자료구조와 함께 배우는 알고리즘 입문 자바편을 직접 푼 코드.
// chapter.01 기본 알고리즘

import java.util.Scanner;

public class BeginnerAlgorithms1 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       // 최대값
//        float a = scanner.nextFloat();
//        float b = scanner.nextFloat();
//        float c = scanner.nextFloat();
//        float max = a;
//        if (b > max) max = b;
//        if (c > max) max = c;
//        System.out.println(max);

        // 양수 1~n 합
//        int n;
//        do {
//            System.out.println("1부터 n까지의 합: ");
//            n = scanner.nextInt();
//        } while (n <= 0); // n이 0보다 클때까지 반복해서 양수만 입력받기
//
//        int sum = 0;
//        for (int i = 0; i <= n; i++)
//            sum += i;
//        System.out.println(sum);

        // 2자리 양수로 제한
//        int nu;
//            do {
//                System.out.println("2자리의 정수만 출력됩니다: ");
//                nu = scanner.nextInt();
//            } while (nu < 10 || nu > 99);
//        System.out.println(nu);

        // 곱셈표
//        System.out.println("  | 1 2 3 4 5 6 7 8 9");
//        System.out.println("--+--------------------------");
//        for (int i=1; i<=9; i++) {
//            System.out.print(i + " | ");
//            for (int j=1; j<=9; j++)
//                System.out.print(i * j + " ");
//            System.out.println();
//        }

        // 직각 이등변 삼각형
            int n;
            do {
                System.out.print("왼쪽 아래가 직각인 몇단 삼각형?: ");
                n = scanner.nextInt();
            } while (n <= 0);

            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++)
                    System.out.print("*");
                System.out.println();
            }

    }

}
