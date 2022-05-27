interface Calculable{
    double hPI = 314;
    int sum(int v1, int v2);
}
interface Printable { // interalbe 대개 형용사
    void print();
}

class RealCal implements Calculable, Printable {
    public int sum(int v1, int v2) {
        return v1+v2;
    }
    public void print() {
        System.out.println("RealCal class");
    }
}

public class PracticeOOP {
    public static void main(String[] args) {
        RealCal c = new RealCal();
        System.out.println(c.sum(7,3));
        c.print();
        System.out.println(c.hPI);
    }
}
