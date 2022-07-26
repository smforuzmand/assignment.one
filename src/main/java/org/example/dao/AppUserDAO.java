package org.example.dao;

import org.example.model.AppUser;

import java.awt.*;
import java.util.List;

public interface AppUserDAO {
    AppUser persist (AppUser appUser);

    AppUser findByUserName (String userName);


    List<AppUser> findAll();
    void remove(String username);
}
