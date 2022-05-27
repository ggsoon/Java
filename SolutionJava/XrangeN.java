import java.util.Arrays;

public class XrangeN {
    public static void main(String[] args) {
        Solution So = new Solution();
        System.out.println(Arrays.toString(So.solution(2,5)));
    }
}
class Solution {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        for(int i=0; i<n; i++) {
            answer[i] = x*(i+1);
        }
        return answer;
    }
}