package hutech.demologin.request;

public class LoginRequest {
    private String email;
    private String pwd;

    public LoginRequest(String email, String pwd) {
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
