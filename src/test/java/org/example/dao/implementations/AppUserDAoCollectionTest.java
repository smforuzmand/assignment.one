package org.example.dao.implementations;

import org.example.dao.AppUserDAO;
import org.example.model.AppRole;
import org.example.model.AppUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppUserDAoCollectionTest {
    private AppUserDAO appUserDAOTest;


    @BeforeEach
    public void setUp() {
        appUserDAOTest = new AppUserDAoCollection();
    }

    @Test
    void test_persist_AppUser() {

        AppUser appUserTest = new AppUser("Meta", "12213443", AppRole.ROLE_APP_USER);

        AppUser expected = appUserDAOTest.persist(appUserTest);

        Assertions.assertEquals(1, appUserDAOTest.findAll().size());
    }


    @Test
    void testFindUser() {

        AppUser appUser = new AppUser("Meta", "12213443", AppRole.ROLE_APP_USER);
        AppUser findUser = appUserDAOTest.findByUserName("Meta");
        assertEquals(appUser, findUser);
    }

    @Test
    void testFindAll() {

        appUserDAOTest.persist(new AppUser("sss", "sssa", AppRole.ROLE_APP_USER));
        appUserDAOTest.persist(new AppUser("ddd", "ddddq", AppRole.ROLE_APP_ADMIN));
        appUserDAOTest.findAll();
        Assertions.assertEquals(2, appUserDAOTest.findAll().size());


    }

    @Test
    void remove() {
        testFindAll();
        appUserDAOTest.remove("sss");
        Assertions.assertEquals(1,appUserDAOTest.findAll().size());
    }
}