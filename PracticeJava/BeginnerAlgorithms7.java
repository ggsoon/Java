// Do it! 자료구조와 함께 배우는 알고리즘 입문 자바편을 직접 푼 코드.
// chapter.06 정렬

import java.util.Arrays;
import java.util.Scanner;

class BubbleSort {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void bubbleSort(int[] a, int n) { // 오름차순
        for (int i = 0; i < n - 1; i++)
            for (int j = n - 1; j > i; j--)
                if (a[j - 1] > a[j])
                    swap(a, j - 1, j);

        System.out.println(Arrays.toString(a));
    }

    static void bubbleSort2(int[] a, int n) {

        for (int i = 0; i < n - 1; i++) {
            int exchg = 0; // 패스의 교환 횟수
            for (int j = n - 1; j > i; j--)
                if (a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                    exchg++;
                }
            if (exchg == 0) break;
        }
    }

    static void bubbleSort3(int[] a, int n) {
        int k = 0; // a[k]보다 앞은 정렬 마침
        while (k < n - 1) {
            int last = n - 1; // 마지막으로 요소를 교환한 위치
            for (int j = n - 1; j < k; j--)
                if (a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                    last = j;
                }
            k = last;
        }
    }

    static void selectionSort(int[] a, int n) { // 단순 선택 정렬
        for (int i = 0; i < n - 1; i++) {
            int min = i; // 아직 정렬 안된 부분에서 가장 작은 요소의 인덱스
            for (int j = i + 1; j < n; j++)
                if (a[j] < a[min])
                    min = j;
            swap(a, i, min);
        }
    }

    static void InsertionSort(int[] a, int n) { // 단순 삽입 정렬
        for (int i = 1; i < n; i++) {
            int j;
            int tmp = a[i];

            for (j = i; j > 0 && a[j - 1] > tmp; j--)
                a[j] = a[j - 1];
            a[j] = tmp;
        }
    }

}

public class BeginnerAlgorithms7 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("요솟수: ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = stdIn.nextInt();
        }

        BubbleSort.bubbleSort(x, nx);

    }
}
