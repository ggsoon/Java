public class PracticeBoo {
    public static void main(String[] args) {
        // String foo = true(reserved word)
        String foo = "hehe man";
        System.out.println(foo.contains("hehe")); // 포함되면 true 아니면 false 반환
        boolean what = foo.contains("man");
        if (what) {
            System.out.println("OK!");
        }

        String id = "abc";
        String inputid = args[0];

        String password = "1234";
        String inputpassword = args[1];

        System.out.println("Hi");
        // if(inputid == id) -> 주소값을 비교
        if (inputid.equals(id) && inputpassword.equals(password)) {
            System.out.println("Master!");
        } else if (inputid.equals(id)) {
            System.out.println("PASSWORDERROR!");
        } else if (inputpassword.equals(password)) {
            System.out.println("IDIDERRORDIDI");
        } else {
            System.out.println("?WHOAREYOU?");
        }
    }
}


