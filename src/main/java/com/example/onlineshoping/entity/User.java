package com.example.onlineshoping.entity;

import jakarta.persistence.*;

@Entity(name = "userdetails")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
<<<<<<< HEAD
=======
    
>>>>>>> branch 'master' of https://github.com/Himanshu-sharma73/shoping.git
    private String name;
    
    private long mobileNo;

    private String email;
    private  String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobileNo=" + mobileNo +
                ", address='" + address + '\'' +
                '}';
    }
}