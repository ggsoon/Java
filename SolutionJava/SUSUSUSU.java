public class SUSUSUSU {
    public static void main(String[] args) {
        Solution6 So = new Solution6();
        System.out.println(So.solution(5));
    }
}

class Solution6 {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();

        while (true) {
            answer.append("수");
            n--;
            if (n == 0) break;
            answer.append("박");
            n--;
            if (n == 0) break;
        }
        return answer.toString();
    }
}
