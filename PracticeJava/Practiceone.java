public class Practiceone {
    public static void main(String[] args) {
        String users[][] = {
                {"fka1243", "g92930"},
                {"gw12", "1234"},
                {"fodsf91", "df0912354"}
        };
        String inputId = args[0];
        String inputPass = args[1];

        boolean isLogin = false; // flag 변수
        for(int i=0; i< users.length; i++) {
            if(inputId.equals(users[i][0]) && inputPass.equals(users[i][1])) {
                isLogin = true;
                break;
            }
        }

        if(isLogin == true)
            System.out.println("Master!");
        else System.out.println("who are you?");

    }
}
