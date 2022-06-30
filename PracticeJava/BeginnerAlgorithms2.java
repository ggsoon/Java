// Do it! 자료구조와 함께 배우는 알고리즘 입문 자바편을 직접 푼 코드.
// chapter.02_1 기본 자료구조_배열

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Random;

class MaxOfArray {
    static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] > max) max = a[i];
        return  max;
    }
}

class ReverseArray {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
    }
    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++)
            swap(a, i, a.length-1-i);
    }
}

class EqualArray {
    static boolean equals(int[] a, int[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i]) return false;

        return true;
    }
}

class CardConvRev {
    // 정수 x를 r진수로 변환하고 배열 d에 아랫자리부터 넣은후 자릿수 반환
    static int cardConvR(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOQPRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r);
            x /= r;
        } while (x != 0);

        return digits;
    }
}

class PrimeNumber { // 1000 이하의 소수를 열거
    static void prime() {
        int count = 0; // 곱셈,나눗셈 횟수
        int ptr = 0; // 찾은 소수의 개수
        int[] prime = new int[500]; // 소수 저장 배열

        prime[ptr++] = 2; // 2,3의 소수를 저쟁해놓음
        prime[ptr++] = 3;

        for (int n = 5; n <= 1000; n += 2) { // 짝수는 소수가 아니라 홀수만
            boolean flag = false;
            for (int i = 1; prime[i] * prime[i] <= n; i++) {
                count += 2;
                if (n % prime[i] == 0) { // 나누어 떨어지면 소수아님
                    flag = true;
                    break;
                }
                if (!flag) { // 마지막까지 나누어 떨어지지 않음
                    prime[ptr++] = n;
                    count++;
                }

                for (int j = 0; i < ptr; i++) System.out.println(prime[j]);
                System.out.println("곱셈과 나눗셈 수행횟수: " + count);
            }
        }
    }
}

class Int2DArray {
    static void ReArray() {
    int [][] x = new int[2][4];
    x[0][1] = 10;
    x[1][1] = 50;

    for (int i = 0; i < 2; i++)
        for (int j = 0; j < 4; j++)
            System.out.println("x[" + i + "][" + j + "] = " + x[i][j]);
    }
}

class DayOfYear { // 그 해 경과 일 수를 구함

    static int MDAYS(int year, int m, int d) {
        int[][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, // 평년
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}  // 윤년
        };
        int days = d;

        // 0이면 편년 1이면 윤년
        for (int i = 1; i < m; i++)
            days += mdays[(year % 4 == 0 && year % 100 != 0
                    || year % 400 == 0) ? 1 : 0][i - 1];
        return days;
    }



}

        public class BeginnerAlgorithms2 {
            public static void main(String[] args) {
                Random rand = new Random();
                Scanner scanner = new Scanner(System.in);

//        // clone 복제
//        int[] a = {1, 2, 3, 4, 5};
//        int[] b = a.clone(); // b는 a의 복제 참조
//
//        b [3] = 0; // 복제므로 원래 배열인 a는 안 바뀜
//
//        System.out.print("a =");
//        for (int i = 0; i < a.length; i++)
//            System.out.print(" " + a[i]);
//
//        System.out.print("\nb =");
//        for (int i = 0; i < b.length; i++)
//            System.out.print(" " + b[i]);
//        System.out.println();
//
//        // 배열 최대값
//        System.out.println("키의 최대값을 구합니다. 사람 수는? ");
//        int n = scanner.nextInt();
//        int[] height = new int[n]; // 배열 크기 지정
//
//        for (int i = 0; i < n; i++) {
//            //System.out.print("height[" + i + "] : ");
//            //height[i] = scanner.nextInt();
//            height[i] = rand.nextInt(40) + 150; // 0~40 + 150 = 150~190
//        }
//
//        System.out.println(Arrays.toString(height)); // 배열 출력
//        System.out.println("최대값은 " + MaxOfArray.maxOf(height));

                // 역순정렬
//        System.out.print("요솟수: ");
//        int num = scanner.nextInt();
//        int[] x = new int[num];
//
//        for (int i =0; i < num; i++)
//            x[i] = rand.nextInt(100);
//
//
//        System.out.println(Arrays.toString(x));
//        ReverseArray.reverse(x);
//        System.out.println(Arrays.toString(x));

                // 모든 요소의 값이 같은지 비교
//        int[] nb = new int[num];
//        nb = x;
//        System.out.println("두 배열은 " +
//                (EqualArray.equals(x, nb) ? "같다":"다르다") );

                // 소수의 나열

                // 소수는 자신과 1이외의 정수로 나누어 떨어지지 않으므로
                // 2부터 n-1 까지의 어떤 정수로도 나누어 떨어지지 않는다.

                // 그 해 경과 일수
                int retry;

                do {
                    System.out.println("년: "); int year = scanner.nextInt();
                    System.out.println("월: "); int month = scanner.nextInt();
                    System.out.println("일: "); int day = scanner.nextInt();
                    System.out.println("그 해" + DayOfYear.MDAYS(year, month, day));
                    System.out.println("한 번 더 할까요? (1:예/0:아니오) : ");
                    retry = scanner.nextInt();
                } while (retry == 1);
            }

        }



