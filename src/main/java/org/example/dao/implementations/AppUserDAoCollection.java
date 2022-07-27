package org.example.dao.implementations;

import org.example.dao.AppUserDAO;
import org.example.model.AppUser;

import java.util.List;

public class AppUserDAoCollection implements AppUserDAO {

    private List<AppUser> appUsers;

    public AppUserDAoCollection(List<AppUser> appUsers) {
        this.appUsers = appUsers;
    }

    @Override
    //persist: add new AppUser.class object to collection
    public AppUser persist(AppUser appUser) {
        if (appUser==null) throw new RuntimeException("null object in not allowed");
        appUsers.add(appUser);
        return appUser;
    }

    @Override
    //findByUsername: returns single AppUser.class object
    public AppUser findByUserName(String userName) {
        for (AppUser user : appUsers){
            if (user.getUserName().equalsIgnoreCase(userName))
                return user;
    }

        return null;
    }

    @Override
    //findAll: returns all AppUser.class objects
    public List<AppUser> findAll() {

        return appUsers;
    }

    @Override
    //remove: remove one AppUser.class object from collection
    public void remove(String username) {
        for (AppUser a : appUsers) {
            if (a.getUserName().equalsIgnoreCase(username))

                appUsers.remove(a);

        }

    }
}
