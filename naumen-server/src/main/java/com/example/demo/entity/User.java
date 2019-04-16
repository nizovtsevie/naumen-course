package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.*;
import org.hibernate.annotations.Cascade;
import java.util.*;

@Entity
@Table
public class User {

    @Id
    @GeneratedValue
    @Column(name="UId", length = 6, nullable=false)
    private long UId;

    @Column(name="username", length = 32, nullable=false)
    private String Username;

    @Column(name="email", length = 32, nullable=false)
    private String Email;

    @Column(name="password", length = 32, nullable=false)
    private String Password;

    @OneToOne(optional = false, cascade = { CascadeType.REMOVE, CascadeType.REFRESH, CascadeType.PERSIST})
    @JoinColumn(name="UId", unique = true, nullable = false, updatable = false)
    private UserData userData;

    @OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER, mappedBy="user")
    private Set<Msg> Msges;


    public User() {

    }
    public User(String username, String email, String password) {
        this.Username = username;
        this.Email = email;
        this.Password = password;
    }

    public long getUId() {
        return UId;
    }

    public void setUId(long UId) {
        this.UId = UId;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public void Fill(String username, String email, String password){
        Username = username;
        Email = email;
        Password = password;
    }

    public UserData getUserData() {
        return userData;
    }

    public void setUserData(UserData userData) {
        this.userData = userData;
    }

    public Set<Msg> getMsges() {
        return Msges;
    }

    public void setMsges(Set<Msg> msges) {
        Msges = msges;
    }
}
