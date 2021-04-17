package ro.ase.acs.proxy;

public class AuthenticationProxy implements Authentication {
    private Authentication authentication = null; // ca sa nu incalcam Dependency Inversion, depindem de abstractizare nu de clasa concreta
    private int failedAuthentications = 0;

    public AuthenticationProxy(Authentication authentication) {
        this.authentication = authentication;
    }

    @Override
    public boolean login(String username, String password) throws SecurityAuthenticationException {
        if(failedAuthentications > 2) {
            throw new SecurityAuthenticationException("Too many failed authentications!");
        }
        if(authentication.login(username,password)) {
            failedAuthentications = 0;
            return true;
        } else {
            failedAuthentications++;
            return false;
        }


    }
}
