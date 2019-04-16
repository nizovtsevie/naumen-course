package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.*;
import org.hibernate.annotations.Cascade;

@Entity
@Table
public class UserData {

    @Id
    @Column(name="UId", length = 6, nullable=false)
    private long UId;

    @Column(name="name", length = 32, nullable=false)
    private String Name;

    @Column(name="phoneNumber")
    private String PhoneNumber;

    @Column(name="registrationDate", nullable=false)
    private String RegistrationDate;

    @OneToOne(optional = false, mappedBy="userData")
    private User user;

    public UserData() {

    }
    public UserData(long uid, String name, String phoneNumber, String registrationDate) {
        this.UId = uid;
        this.Name = name;
        this.PhoneNumber = phoneNumber;
        this.RegistrationDate = registrationDate;
    }

    public long getUId() {
        return UId;
    }

    public void setUId(long UId) {
        this.UId = UId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getRegistrationDate() {
        return RegistrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        RegistrationDate = registrationDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
