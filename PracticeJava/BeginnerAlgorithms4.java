// Do it! 자료구조와 함께 배우는 알고리즘 입문 자바편을 직접 푼 코드.
// chapter.03 검색

import java.util.Scanner;

class SeqSearch {
    // 요솟수가 n인 배열 a에서 key 선형 검색
    static int seqSearch(int[] a, int n, int key) {

//        int i = 0;
//        while (true) {
//            if (i == n) return -1; // 검색 실패
//            if (a[i] == key) return i; // 인덱스 반환
//            i++;
//        }

        for (int i = 0; i < n; i++)
            if (a[i] == key)
                return i;
        return -1;
    }

    static int seqSearchSen(int[] a, int n, int key) {
        // 보초법 요솟수+1 인덱스 마지막에 키값인 보초를 넣어
        // 검색 실패대신 검색종료하여 종료판단횟수를 2회에서 1회로 줄임

        int i = 0;
        a[n] = key;

        while (true) {
            if (a[i] == key) break;
            i++;
        }

        return i == n ? -1 : i; // 보초인지 판단
    }
}

class BinSearch {
    // 이진검색 이미 sort되어 있어야 함 logn
    static int binSearch(int[] a, int n, int key) {
        int pl = 0; // 첫 인덱스
        int pr = n - 1; // 끝 인덱스

        do {
            int pc = (pl + pr) / 2; // 중앙 인덱스

            if (a[pc] == key) return pc; // 검색 성공

            else if (a[pc] < key) pl = pc + 1; // 검색 범위를 뒤 절반으로 좁힘
            else pr = pc - 1; // 검색 범위를 앞

        } while (pl <= pr);
        return -1; // 검색 실패
    }
}

public class BeginnerAlgorithms4 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        // 순차 검색
        System.out.println("요솟수: ");
        int num = stdIn.nextInt();
//        int[] x = new int[num];
//
//        for (int i = 0; i < num; i++) {
//            System.out.print("x[" + i + "] : ");
//            x[i] = stdIn.nextInt();
//        }
//
//        System.out.println("검색할 값 : ");
//        int key = stdIn.nextInt();
//
//        int idx = SeqSearch.seqSearch(x, num, key);
//        if(idx == -1) System.out.println("그 값은 배열에 없습니다.");
//        else System.out.println(key + "는 x[" + idx + "]");
        
        
//        int[] x = new int[num + 1]; // 보초를 위해 1를 더함
//
//        for (int i = 0; i < num; i++) {
//            System.out.print("x[" + i + "] : ");
//            x[i] = stdIn.nextInt();
//        }
//
//        System.out.println("검색할 값 : ");
//        int key = stdIn.nextInt();
//
//        int idx = SeqSearch.seqSearchSen(x, num, key);
//        if(idx == -1) System.out.println("그 값은 배열에 없습니다.");
//        else System.out.println(key + "는 x[" + idx + "]");

        // 이진 검색
        int[] x = new int[num];
        System.out.println("오름차순으로 입력하세요: ");
        System.out.println("x[0]: "); // 첫 요소 입력
        x[0] = stdIn.nextInt();
        
        for (int i = 1; i < num; i++) {
            do {
                System.out.println("x[" + i + "]:");
                x[i] = stdIn.nextInt();
            } while (x[i] < x[i-1]); // 오름차순이 아니면 다시 입력
        }

        System.out.println("검색할 값:"); 
        int key = stdIn.nextInt();
        int idx = BinSearch.binSearch(x, num, key);
        
        if (idx == -1) System.out.println("그 값은 배열에 없습니다");
        else System.out.println(key + "는 x[" + idx + "]에 있습니다");
    }
}