package com.itheima._03xml解析案例;

/**
 * @author pkxing
 * @version 1.0
 * @Package com.itheima._03xml解析案例
 * @date 2018/11/16  下午6:25
 */
public class Contact {
    private String id;
    private String name;
    private String gender;
    private String email;
    private String qq;
    private String phone;

    public Contact(String id, String name, String gender, String email, String qq, String phone) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.qq = qq;
        this.phone = phone;
    }

    public Contact() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", qq='" + qq + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
