
class Solution9{
   public int[] solution(long n) {
       String temp = n + ""; // 문자열 + 숫자 = 문자열
       int[] answer = new int[temp.length()];
       int cnt = 0;
       while(n > 0) {
           answer[cnt] = (int) (n %= 10);
           n /= 10;
           cnt++;
       }
       return answer;
   }
}
