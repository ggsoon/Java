class Cal2 {
    int v1, v2;

    Cal2(int v1, int v2) {
        System.out.println("Cal2 init!");
        this.v1 = v1;
        this.v2 = v2;
    }
}

class EnCal extends Cal2 {
    EnCal(int v1, int v2) {
        super(v1, v2); // 생성자가 있다면 부모 클래스 먼저 실행되는 super를 넣어야 함
        System.out.println("EnCal init!");
    }

    public int minus() {
        return this.v1 - v2;
    }
}

public class Practiceinherit2 {
    public static void main(String[] args) {
        Cal2 cl = new Cal2(1, 2);
        EnCal Ecl = new EnCal(3, 4);
        System.out.println(Ecl.minus());
    }
}
