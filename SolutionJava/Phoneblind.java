public class Phoneblind {
    public static void main(String[] args) {
        Solution2 So = new Solution2();
        System.out.println(So.solution("01012345678"));
    }
}

class Solution2 {
    public String solution(String phone_number) {
        String answer = phone_number;
        String temp = "";

        temp = answer.substring(answer.length()-4);
        answer = answer.substring(0, answer.length()-temp.length());
        answer = answer.replaceAll("[0123456789]", "*");
        answer = answer + temp;
        return answer;
    }
}

//    char[] ch = phone_number.toCharArray();
//     for(int i = 0; i < ch.length - 4; i ++){
//        ch[i] = '*';
//        }
//        return String.valueOf(ch);