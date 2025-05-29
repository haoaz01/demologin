package hutech.demologin.request;

public class RegisterRequest {
    private String email;
    private String pwd;

    public RegisterRequest(String email, String pwd) {
        this.email = email;
        this.pwd = pwd;
    }

    public String getEmail() {
        return email;
    }

    public String getPwd() {
        return pwd;
    }
}
