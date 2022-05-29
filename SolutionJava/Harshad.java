public class Harshad {
    public static void main(String[] args) {
        int x = 11;
        Solution5 So = new Solution5();
        System.out.println(So.solution(x));
    }
}

class Solution5 {
    public boolean solution(int n) {

        int p = n;
        int temp = 0;
        boolean answer = true;

        while(n != 0) {
            temp += n % 10;
            n /= 10;
        }

        if (p % temp == 0) return answer;
        else answer = false;

        return answer;
    }
}