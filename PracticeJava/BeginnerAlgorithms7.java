// Do it! 자료구조와 함께 배우는 알고리즘 입문 자바편을 직접 푼 코드.
// chapter.06 정렬

import java.util.Scanner;

class BubbleSort {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void bubbleSort(int[] a, int n){
        for (int i = 0; i < n - 1; i++)
            for (int j = n - 1; j > i; j--)
                if (a[j - 1] > a[j])
                    swap(a, j - 1, j);

                System.out.println(a);
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
