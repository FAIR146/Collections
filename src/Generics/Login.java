package Generics;

public class Login <T,S>{
    private final T login;
    private final S password;

    Login (T login, S password) {
        this.login = login;
        this.password = password;
    }
    public T getLogin () {
        return login;
    }
    public S getPassword () {
        return password;
    }
}
