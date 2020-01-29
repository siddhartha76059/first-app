package com.bapu.test.firstapp.model;

public class User {
    private String Name;
    private String Age;
    private String Email;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "Name='" + Name + '\'' +
                ", Age='" + Age + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}
