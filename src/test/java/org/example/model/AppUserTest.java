package org.example.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class AppUserTest {

    public AppUser appUserTest;

    @BeforeEach
    public void setAppUserTest() {
        appUserTest = new AppUser("VSCode", "22313", AppRole.ROLE_APP_USER);
    }

    @Test
    void getUserName_Test_successfully() {
        String userName = appUserTest.getUserName();
        Assertions.assertEquals("VSCode", userName);
    }

    @Test
    @DisplayName("App user name should be filled with value")
    void userNameNull_throw_IllegalArgumentException() {

        assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            // test to assure when set username nulll throw exception;
            public void execute() throws Throwable {
                appUserTest.setUserName(null);

            }
        });

    }

    @Test
    void setUserName_Test_NewObeject() {
        AppUser appUser = new AppUser("VSCode", "22313", AppRole.ROLE_APP_USER);
        assertEquals(appUser, appUserTest);
    }

    @Test
    void getPassword() {

        assertEquals("22313", appUserTest.getPassword());
    }

    @Test
    void setPassword_test_() {
        AppUser appUser = new AppUser("VSCode", "22313", AppRole.ROLE_APP_USER);
        appUserTest.setPassword("0000");
        assertNotEquals(appUser.getPassword(), appUserTest.getPassword());
    }

    @Test
    @DisplayName("Test to see whether it throw illegalException")
    void setPassword_null_throw_IllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                appUserTest.setPassword(null);
            }
        });

    }

    @Test
    void test_equal() {
        AppUser appUser = new AppUser("VSCode", "22313", AppRole.ROLE_APP_USER);
        assertEquals(appUserTest,appUser);
    }
}