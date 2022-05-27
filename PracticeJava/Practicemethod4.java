public class Practicemethod4 {

    public static class Print { // static를 붙여 객체 생성 없이 메소드 부름
        public static String d = "d";

        public static void A() {
            System.out.println(d + "\na");
        }

        public static void B() {
            System.out.println(d + "\nb");
        }
    }


    static class PrintD {
        public String delimiter = "";
        public PrintD(String _delimiter) { // 같은이름 메소드면 인스턴스화 될때마다 실행하는 생성자
            this.delimiter = _delimiter; // this는 인스턴스를 말함
        }
    }

    public static void main(String[] args) {
        Print.A();
        Print.d = "B";
        Print.B();
        PrintD PD = new PrintD("----");

    }
}
