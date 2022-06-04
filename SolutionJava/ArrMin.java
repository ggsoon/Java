import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrMin {
    public static void main(String[] args) {
        int[] answer = {4,3,2};
       int min = Arrays.stream(answer).min().getAsInt();
        for(int i=0; i<answer.length; i++) {
         if (answer[i] == min) {
             Arrays.stream(answer).reduce();
             System.out.println(Arrays.toString(answer));
         }
        }
       // System.out.println(X[0] = -1);
    }
}
