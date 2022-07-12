// Do it! 자료구조와 함께 배우는 알고리즘 입문 자바편을 직접 푼 코드.
// chapter.03 검색

import java.util.Arrays;
import java.util.Comparator;
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

class PhysExamSearch {
    static class PhyscData {
        private String name;
        private int height;
        private double vision;

        public PhyscData(String name, int height, double vision) {
            this.name = name; this.height = height; this.vision = vision;
        }
        public String toString() {
            return name + " " + height + " " + vision;
        }

        public static final Comparator<PhyscData> HEIGHT_ORDER
                = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhyscData> {
            public int compare(PhyscData d1, PhyscData d2) {
                return (d1.height > d2.height) ? 1 :
                        (d1.height < d2.height) ? -1 : 0;
            }
        }
    }
}

class GenericClassTest { // 제네릭은 자료형에 의존하지 않는 범용 클래스(인터페이스) 구현 방식
    static class GenericClass<T> {
        private T n;
        GenericClass(T t) { // 생성자
            this.n = t;
        }
        T getn() {
            return n;
        }
    }
}

public class BeginnerAlgorithms4 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        // 순차 검색
//      System.out.println("요솟수: ");
//        int num = stdIn.nextInt();
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
//        int[] x = new int[num];
//        System.out.println("오름차순으로 입력하세요: ");
//        System.out.println("x[0]: "); // 첫 요소 입력
//        x[0] = stdIn.nextInt();
//
//        for (int i = 1; i < num; i++) {
//            do {
//                System.out.println("x[" + i + "]:");
//                x[i] = stdIn.nextInt();
//            } while (x[i] < x[i-1]); // 오름차순이 아니면 다시 입력
//        }
//
//        System.out.println("검색할 값:");
//        int key = stdIn.nextInt();
//        int idx = BinSearch.binSearch(x, num, key);
//        //int idx = Arrays.binarySearch(x, key);
//
//        if (idx == -1) System.out.println("그 값은 배열에 없습니다");
//        else System.out.println(key + "는 x[" + idx + "]에 있습니다");

        // 자연 정렬1
//        String[] x = {"static", "volatile", "instanceof", "assert"};
//        System.out.print("원하는 키워드는: ");
//        String key = stdIn.next();
//        int idx = Arrays.binarySearch(x, key); // 배열 x에서 key 검색
//
//        if (idx < 0) System.out.println("해당 키워드가 없습니다.");
//        else System.out.println("해당 키워드는 x[" + idx + "]에 있습니다.");

        // 자연 정렬2
        PhysExamSearch.PhyscData[] x = {
                new PhysExamSearch.PhyscData("가나다", 160, 0.5),
                new PhysExamSearch.PhyscData("마바사", 180, 0.3),
                new PhysExamSearch.PhyscData("abc", 170, 1.0),
        };
        System.out.print("몇 cm를 찾을까? : ");
        int height = stdIn.nextInt();
        int idx = Arrays.binarySearch(x, new PhysExamSearch.PhyscData("", height, 0.0),
                PhysExamSearch.PhyscData.HEIGHT_ORDER);
        if (idx < 0) System.out.println("요소가 없습니다");
        else {
            System.out.println("x[" + idx + "]에 있습니다");
            System.out.println("찾은 데이터는 " + x[idx]);
        }
    }
}
