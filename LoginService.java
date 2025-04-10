public class LoginService {
    public boolean login(String username, String password) {
        if (username == null || password == null || username.isEmpty() || password.isEmpty()) {
            return false;
        }
        // Simulated authentication (replace with actual logic)
        return username.equals("user123") && password.equals("password123");
    }
}
