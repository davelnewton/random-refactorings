public class OverlyVerboseLoginAction {

    private String username;
    private String password;
    private boolean loginValid;

    public String execute () {

        boolean authenticated = login( getUsername(), getPassword() );
        setLoginValid( authenticated );

        if ( authenticated ) 
            result = SUCCESS;
        else 
            result = FAILURE;

        return result;

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
    
}
