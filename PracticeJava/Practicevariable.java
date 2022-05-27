public class Practicevariable {
    public static void main(String [] args) {
        int a = 10; // Natural Number 자연수 -> integer 정수
        double b = 1.1; // real number

        String name = "Minge";
        System.out.println("Hello "+name+" How are you? "+name+" Thank you.");

        double VAT = 20.0; // 부가가치세
        System.out.println(VAT);

        // CASTING 변환
        int c = (int) 3.14;
        int d = (int) Math.PI; // 명시적
        String str1 = Integer.toString(3);

        System.out.println(c+d+str1);
        System.out.println(str1.getClass());

        // int 원시 자료형. 산술연산가능, null 초기화X
        // Integer Wrapper 클래스(객체), unboxing를 하지 않으면 산술 연산x, null값 처리가능(SQL 연동 처리용이)
            // DB에서 자료형이 정수형이지만 null 값이 필요하면 VO에서 Interger를 사용할 수 있음

    }
}

