public class PlaceValuePlus {
    public static void main(String[] args) {
        Solution4 So = new Solution4();
        System.out.println(So.solution(123));
    }
}

class Solution4 {
    public int solution(int n) {
        int answer = 0;

        while (n != 0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
}