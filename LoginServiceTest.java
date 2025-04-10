import junit.framework.TestCase;

public class LoginServiceTest extends TestCase {

    private LoginService loginService;

    protected void setUp() throws Exception {
        super.setUp();
        loginService = new LoginService();
    }

    public void testValidLogin() {
        boolean result = loginService.login("user123", "password123");
        assertTrue("Valid credentials should return true", result);
    }

    public void testInvalidLogin() {
        boolean result = loginService.login("wrongUser", "wrongPass");
        assertFalse("Invalid credentials should return false", result);
    }

    public void testEmptyUsername() {
        boolean result = loginService.login("", "password123");
        assertFalse("Empty username should return false", result);
    }

    public void testEmptyPassword() {
        boolean result = loginService.login("user123", "");
        assertFalse("Empty password should return false", result);
    }

    public void testNullUsername() {
        boolean result = loginService.login(null, "password123");
        assertFalse("Null username should return false", result);
    }

    public void testNullPassword() {
        boolean result = loginService.login("user123", null);
        assertFalse("Null password should return false", result);
    }
}
