public class Squared {
    public static void main(String[] args) {
        Solution7 So = new Solution7();
        System.out.println(So.solution(121));
    }
}

class Solution7 {
   public long solution(long n) {
       long sqrt = (long) Math.sqrt(n);
       if (n == sqrt*sqrt) return (sqrt+1)*(sqrt+1);
       return -1;
   }
}
