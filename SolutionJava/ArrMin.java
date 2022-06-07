import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrMin {
    public static void main(String[] args) {
        int[] answer = {4,3,2};
       if (answer.length == 1) {
           answer = new int[]{-1};
           System.out.println(Arrays.toString(answer));
       }
       int min = Arrays.stream(answer).min().getAsInt();
        for(int i=0; i<answer.length; i++) {
         if (answer[i] == min) {
             answer = Arrays.stream(answer).filter(j -> j != min).toArray();
             System.out.println(Arrays.toString(answer));
         }
        }
       // System.out.println(X[0] = -1);
        // stream은 느리므로 조심
    }
}
