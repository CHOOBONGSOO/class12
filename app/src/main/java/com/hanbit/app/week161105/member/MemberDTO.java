package com.hanbit.app.week161105.member;

/**
 * Created by 1027 on 2016-11-12.
 */

public class MemberDTO {
    private String id, pw, name, email, phone, photo, addr;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "회원정보{" +
                "아이디='" + id + '\'' +
                ", 비번='" + pw + '\'' +
                ", 이름='" + name + '\'' +
                ", email='" + email + '\'' +
                ", 전화번호='" + phone + '\'' +
                ", 이미지='" + photo + '\'' +
                ", 주소'" + addr + '\'' +
                '}';
    }
}
