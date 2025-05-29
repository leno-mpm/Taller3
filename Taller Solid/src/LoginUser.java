public class LoginUser implements LogIn {
    private UserRepository userR;
    @Override
    public void log(User user) {
        System.out.println("Has access to the website");
        userR.insertUserInDatabase(user);
    }
}
