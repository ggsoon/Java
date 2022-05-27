public class Practicemethod2 {

    public static void printTwoTimes(String text, String delimiter) { // delimiter 구분자
        System.out.println(text);
        System.out.println(delimiter);
        System.out.println("--------");
    }

    public static String a() {
        return "a";
    }
    public static int one() {
        return 1;
    }


    public static void main(String[] args) {

        int i = 1;
        while (i >= 0) {
            printTwoTimes(a(), "+");
            printTwoTimes("2", "-");
            printTwoTimes("3", "*");
            printTwoTimes("4", "/");
            i--;
        }

        System.out.println(a());
        System.out.println(one());

    }
}
