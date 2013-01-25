public class OverlyVerboseLoginAction {

    private String username;
    private String password;
    private boolean loginValid;

    private UserService userService;

    public String execute () {
        loginValid = userService.login(username, password);
        return loginValid ? SUCCESS : FAILURE;
    }

    public String getUsername() { 
        return username;
    }

    public void setUsername(String username) { 
        this.username = username; 
    }

    public String getPassword() { 
        return password; 
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean isLoginValid() {
        return loginValid;
    }

    public void setLoginValid(boolean loginValid) {
        this.loginValid = loginValid;
    }
    
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

}
