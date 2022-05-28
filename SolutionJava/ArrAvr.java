import java.util.Arrays;
import java.util.*;

public class ArrAvr {
    public static void main(String[] args) {
        int[] inputarr = {75,95,100};
        Solution3 So = new Solution3();
        System.out.println(So.solution(inputarr));
    }
}

class Solution3 {
    public double solution(int[] arr) {
        double answer = Arrays.stream(arr).sum();
        return answer / arr.length;
    }
}
