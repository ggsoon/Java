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

class EightQueen {
    static boolean[] flag = new boolean[8]; // 각 행에 퀸 배치했는지 체크

    static boolean[] flag_b = new boolean[15]; // ↙대각선 방향으로 퀸 배치 체크
    static boolean[] flag_c = new boolean[15]; // ↘대각선 방향으로 퀸 배치 체크
    static int[] pos = new int[8]; // 배열은 열 값은 행

    // 각 열의 퀸 위치 출력
    static void print() {
        for (int i = 0; i < 8; i++)
            System.out.printf("%2d", pos[i]);
        System.out.println();
    }

    // 각 행에 퀸을 1개만 배치
    static void EightRook(int i) {
        for (int j = 0; j < 8; j++) {
            if (flag[j] == false) // j행에는 퀸이 아직 배치가 안됬다면
                pos[i] = j; // 퀸을 j행에 배치한다
                if (i == 7) // 모든 열에 배치한 경우
                    print();
                else {
                    flag[j] = true;
                    EightRook(i + 1);
                    flag[j] = false;
                }
        }
    }

    static void eightqueen(int i) {
        for (int j = 0; j < 8; j++) {
            if (flag[j] == false &&
                flag_b[i + j] == false &&
                flag_c[i - j + 7] == false) {
              pos[i] = j;
              if (i == 7)
                  print();
              else {
                  flag[j] = flag_b[i + j] = flag_c[i - j + 7] = true;
                  eightqueen(i + 1);
                  flag[j] = flag_b[i + j] = flag_c[i - j + 7] = false;
              }
            }
        }
    }
}

public class BeginnerAlgorithms6 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
//        System.out.println("x 정수를 입력하세요: ");
//        int x = stdIn.nextInt();
//        System.out.println("y 정수를 입력하세요: ");
//        int y = stdIn.nextInt();
//
//        System.out.println(x + "의 팩토리얼은 " + Factorial.factorial(x));
//        System.out.println("최대공약수는 " + EuclidGCD.gcd(x, y) + "입니다.");
//        Recur.recur(x);
//        Recur.recurStack(x);
//
//        System.out.println();
//        System.out.print("하노이의 탑 원반 개수 : ");
//        int n = stdIn.nextInt();
//        Recur.Hanoi.move(n, 1, 3);

        EightQueen.EightRook(0);
        EightQueen.eightqueen(0);
    }
}
