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

    static void recurStack(int n) {
        IntStack s = new IntStack(n);

        while (true) {
            if (n > 0) {
                s.push(n);
                n = n - 1;
                continue;
            }
            if (s.isEmpty() != true) {
                n = s.pop();
                System.out.print(n + " ");
                n = n - 2;
                continue;
            }
            break;
        }
    }

    static class Hanoi { // 바닥원반이 아닌 원반들을 그룹으로 함
                 // 그룹을 중간기둥으로 옮기고 바닥원반을 목표 기둥으로
                 // 그룹을 중간 기둥에서 목표 기둥으로
        static void move(int no, int x, int y) { // no 원반수 x에서 y로 옮김 6-x-y 중간기둥
            if (no > 1)
                move(no - 1, x, 6 - x - y);
            System.out.println("원반 [" + no + "]을" +
                    x + "기둥에서 " + y + "기둥으로 옮김");

            if (no > 1)
                move(no - 1, 6 - x - y, y);
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
        Recur.recurStack(x);

        System.out.println();
        System.out.print("하노이의 탑 원반 개수 : ");
        int n = stdIn.nextInt();
        Recur.Hanoi.move(n, 1, 3);
    }
}
