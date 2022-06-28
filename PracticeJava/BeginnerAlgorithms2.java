// Do it! 자료구조와 함께 배우는 알고리즘 입문 자바편을 직접 푼 코드.
// chapter.02 기본 자료구조

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
    public static void main(String[] args) {
        int count = 0; // 나눗셈의 횟수
        int ptr = 0; // 찾은 소수의 개수
        int[] prime = new int[500]; // 소수 저장 배열
        prime[ptr++] = 2;

        for (int n = 3; n <= 1000; n += 2) { // 홀수만
            int i;
            for (i = 1; i < ptr; i++) {
                count++;
                if (n % prime[i] == 0)
                    break;
            }
            if (ptr == i)
                prime[ptr++] = n;
        }

        for (int i = 0; i < ptr; i++)
            System.out.println(prime[i]);

        System.out.println(count);
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
    }


}

