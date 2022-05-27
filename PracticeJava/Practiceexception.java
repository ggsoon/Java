import java.io.FileWriter;
import java.io.IOException;

public class Practiceexception {
    public static void main(String[] args) throws IOException {

        int[] scores = {1, 2, 3};
        try {
            System.out.println(scores[1]);
            System.out.println(2 / 0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("이 값은 존재하지 않습니다." + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("잘못된 계산입니다." + e.getMessage());
        }

        // e는 인스턴스로 디버거나 메소드를 사용해서 디테일한 정보를 확인할 수 있다.
        // try안에 객체를 안넣으면 finally에서 f.close해야함
        // try with resource statements 자동으로 f에서 close
        try (FileWriter f = new FileWriter("ex.txt");) {
            f.write("helllo");
            // 여기서 close를 하고 싶지만 예외가 발생할 수 있으므로 finally로 처리
        } catch (IOException e) {
            e.getMessage();
            e.printStackTrace(); // 단계별로 에러 출력
        }
    }
}
