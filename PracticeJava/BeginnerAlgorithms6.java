// Do it! 자료구조와 함께 배우는 알고리즘 입문 자바편을 직접 푼 코드.
// chapter.05 재귀

import java.util.Scanner;

class Factorial {
    static int factorial(int n) {
        if (n > 0)
            return n * factorial(n - 1);
        else
            return 1;
    }
}

class EuclidGCD {
    // 정수 x, y의 최대공약수
    static int gcd(int x, int y) {
        if (y == 0)
            return x;
        else
            return gcd(y, x % y);
    }
}

class Recur { // 하향식, 상향식으로 이해해보기
    static void recur(int n) {
        if (n > 0) {
            recur(n - 1);
            System.out.print(n + " ");
            recur(n - 2);
        }
    }
}

public class BeginnerAlgorithms6 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("x 정수를 입력하세요: ");
        int x = stdIn.nextInt();
        System.out.println("y 정수를 입력하세요: ");
        int y = stdIn.nextInt();

        System.out.println(x + "의 팩토리얼은 " + Factorial.factorial(x));
        System.out.println("최대공약수는 " + EuclidGCD.gcd(x, y) + "입니다.");
        Recur.recur(x);
    }
}
