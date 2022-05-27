class Cal{


    public double plus(double v1, double v2) {
        return v1 + v2;
    }
    public double minus(double v1, double v2) {
        return v1 - v2;
    }
    public double multiply(double v1, double v2) {
        return v1 * v2;
    }
    public double divide(double v1, double v2) {
        return v1 / v2;
    }
}

class EngineeringCal extends Cal {

    public double max(double v1, double v2) {
        return Math.max(v1, v2);
    }


    //Overloading 매개변수 다름
    public double minus(double v1, double v2, double v3) {
        return v1 - v2 - v3;
    }

    //Override 메소드 재정의
    public double plus100(double v1, double v2) {
        System.out.println("공학용 계산기입니다.");
        return super.plus(v1, v2) + 100;
    }

    public double plusv3(double v3) {
        return this.plus100(v3, v3) + v3;
    };
}

public class Practiceinherit {
    public static void main(String[] args) {
        Cal Cal1 = new Cal();
        System.out.println(Cal1.divide(10.5, 10.0));
        EngineeringCal EnCal1 = new EngineeringCal();
        System.out.println(EnCal1.plus100(5, 10));
        System.out.println(EnCal1.minus(20,10));
        System.out.println(EnCal1.minus(20,10,10));
        System.out.println(EnCal1.max(10.1, 10.10));
        System.out.println(EnCal1.plusv3(77));
    }
}
