package com.tjetc.entity;

public class User {
    //用户属性
    private String user_id;
    private String user_name;
    private String user_username;
    private String user_password;
    private int user_role;
    private String user_address;
    private String user_payment;
    private String user_phone;
    private String user_sex;
    private int user_age;

    //构造方法

    public User() {
    }

    public User(String user_id, String user_name, String user_username, String user_password, int user_role, String user_address, String user_payment, String user_phone, String user_sex, int user_age) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_username = user_username;
        this.user_password = user_password;
        this.user_role = user_role;
        this.user_address = user_address;
        this.user_payment = user_payment;
        this.user_phone = user_phone;
        this.user_sex = user_sex;
        this.user_age=user_age;
    }

    public User(String user_username, String user_password) {
        this.user_username = user_username;
        this.user_password = user_password;
    }

    //set方法和get方法

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_username() {
        return user_username;
    }

    public void setUser_username(String user_username) {
        this.user_username = user_username;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public int getUser_role() {
        return user_role;
    }

    public void setUser_role(int user_role) {
        this.user_role = user_role;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public String getUser_payment() {
        return user_payment;
    }

    public void setUser_payment(String user_payment) {
        this.user_payment = user_payment;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(String user_sex) {
        this.user_sex = user_sex;
    }

    public int getUser_age() {
        return user_age;
    }

    public void setUser_age(int user_age) {
        this.user_age = user_age;
    }

    //toString方法

    @Override
    public String toString() {
        return "User{" +
                "user_id='" + user_id + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_username='" + user_username + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_role=" + user_role +
                ", user_address='" + user_address + '\'' +
                ", user_payment='" + user_payment + '\'' +
                ", user_phone='" + user_phone + '\'' +
                ", user_sex='" + user_sex + '\'' +
                ", user_age='" + user_age + '\'' +
                '}';
    }
}