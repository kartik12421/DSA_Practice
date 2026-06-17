package bank;

class Account {

    public String name;
    protected String email;
    private String password;

    //getters and setters
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }
}

public class Bank {

    public static void main(String[] args) {
        Account ac = new Account();
        ac.name = "KJ";
        ac.email = "kj@gmail.com";
        ac.setPassword("abcd");
        System.out.println(ac.getPassword());
    }
}
