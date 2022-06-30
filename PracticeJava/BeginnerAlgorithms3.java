// Do it! 자료구조와 함께 배우는 알고리즘 입문 자바편을 직접 푼 코드.
// chapter.02_2 기본 자료구조_클래스

import java.util.Scanner;

class PhysicalExamination { // 평균 키와 시력의 분포

    static final int VMAX = 21; // 시력 분포 0.0에서 0.1 단위로 21개

    static class PhyscData {
        String name; // 이름
        int height; // 키
        double vision; // 시력

        // 생성자
        PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    static double aveHeight(PhyscData[] dat) { // 키의 평균값
        double sum = 0;

        for(int i = 0; i < dat.length; i++) sum += dat[i].height;

        return sum / dat.length;
    }

    static void distVision(PhyscData[] dat, int[] dist) { // 시력 분포
        int i = 0;
        dist[i] = 0;

        for (i = 0; i < dat.length; i++)
            if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0)
                dist[(int)(dat[i].vision*10)]++;

    }
}

class Exampleclass {
    private int f1; // 비공개 필드
    protected int f2; // 한정 공개 필드
    public int f3; // 공개 필드
    static final int S1 = 0; // 정적 상수 필드
    public Exampleclass() { // 생성자
        f1 = f2 = f3 = 0;
    }
    public Exampleclass(int f1, int f2, int f3) {
        this.f1 = f1;
        this.f2 = f2;
        this.f3 = f3;
    }
    public void setF1(int f) { // 메서드 F1 setter
        f1 = f;
    }
    public int getF1() { return f1; }
}


public class BeginnerAlgorithms3 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        PhysicalExamination.PhyscData[] x = {
                new PhysicalExamination.PhyscData("신동엽", 180, 0.5),
                new PhysicalExamination.PhyscData("강호동", 200, 1.0),
                new PhysicalExamination.PhyscData("유재석", 180, 2.0),
        };
        int[] vdist = new int[PhysicalExamination.VMAX]; // 시력분포

        System.out.println("ㅁ 신체검사 리스트 ㅁ");
        System.out.println("이름       키   시력");
        System.out.println("-------------------");
        for (int i = 0; i < x.length; i++)
            System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
        System.out.printf("\n평균 키: %5.1fcm\n", PhysicalExamination.aveHeight(x));
    }
}
