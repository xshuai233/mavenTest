package mavenTest.pojo;

public class Account {
    private String username = null;
    private String password = null;

    public void setUsername(String a) {
        username = a;
    }
    public void setPassword(String a) {
        password = a;
    }

    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return username + "\n" + password;
    }

}
