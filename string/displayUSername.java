
public class displayUSername {

    public static void main(String[] args) {
        String email1 = "jackie@gmail.com"; 
        String email2 = "jullie@gmail.com";

        String username1 = email1.substring(0, 6);
        String username2 = "";

        System.out.println(username1);
        //or

        for(int i = 0; i < email2.length(); i++){
            char ch = email2.charAt(i);
            if (ch == '@'){
                break;
            } else{
                username2 += ch;
            }
        }
        System.out.println(username2);
    }
}
