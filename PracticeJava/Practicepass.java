public class Practicepass {
    public static void main(String[] args) {
        String id = "xxx";
        String inputid = args[0];

        // password를 두개 가진 관리자
        String pass = "q1w2e3r4";
        String pass2 = "0101";
        String inputPass = args[1];


        System.out.println("Hello");
        boolean isRightPass = (inputPass.equals(pass) || inputPass.equals(pass2));
        if(inputid.equals(id) && isRightPass) {
            System.out.println(" Master!");
        } else {
            System.out.println("?????");
        }

    }
}
