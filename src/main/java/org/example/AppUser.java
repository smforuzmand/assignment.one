package org.example;

import com.sun.xml.internal.ws.developer.MemberSubmissionAddressing;

import javax.xml.bind.ValidationEvent;
import java.util.Objects;

public class AppUser {
    private String userName;
    private String password;
    private AppRole role;

    public AppUser(String userName, String password, AppRole role) {
        this.userName = userName;
        this.password = password;
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if ((userName == null) || (userName.trim().equals(""))) {
            throw new IllegalArgumentException("not allowed to be null or empty");
        }
        //if (userName!=null && !userName.trim().isEmpty())

        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if ((password == null) || (password.trim().equals(""))) {
        throw new IllegalArgumentException("not allowed to be null or empty");
    }
        this.password = password;
    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        if (userName == null) {
            throw new IllegalArgumentException("not allowed to be null or empty");
        }
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return userName.equals(appUser.userName) && role == appUser.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, role);
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "userName='" + userName + '\'' +
                ", role=" + role +
                '}';
    }
}
