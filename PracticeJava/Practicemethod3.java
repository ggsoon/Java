import java.io.FileWriter;
import java.io.IOException;

public class Practicemethod3 {

    public static void main(String[] args) throws IOException { // 입출력 예외처리
        printTwoTimes("a", "-");

        System.out.println(twoTimes("t", "d"));

        writeFileTwoTimes("w","*");

        printTwoTimes("a", "&");
        printTwoTimes("b", "!");
    }

    public static String twoTimes(String text, String delimiter) {
        String out = "";
        out = out + "\n";
        out = out + delimiter;
        out = out + text +"\n";
        out = out + text +"\n";
        return out;
    }

    public static void printTwoTimes(String text, String delimiter) {
        System.out.println(delimiter);
        System.out.println(text);
        System.out.println(text);
    }

    public static void writeFileTwoTimes(String text, String delimiter) throws IOException {
        FileWriter fw = new FileWriter("output.txt");  // fw는 FileWriter 클래스의 인스턴스 (객체를 메모리에 할당)
        fw.write(delimiter+"\n");
        fw.write(text+"\n");
        fw.write(text+"\n");
        fw.close();
    }

}
