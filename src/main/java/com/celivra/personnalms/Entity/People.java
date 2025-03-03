package com.celivra.personnalms.Entity;

public class People {
    private String id ,name ,gender ,age ,birth ,email ,phone ,poli_look;

    public People() {}

    public People(String name, String gender, String age, String birth, String email, String phone, String poli_look) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.birth = birth;
        this.email = email;
        this.phone = phone;
        this.poli_look = poli_look;
    }

    public People(String id, String name, String gender, String age, String birth, String email, String phone, String poli_look) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.birth = birth;
        this.email = email;
        this.phone = phone;
        this.poli_look = poli_look;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPoli_look(String poli_look) {
        this.poli_look = poli_look;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getAge() {
        return age;
    }

    public String getBirth() {
        return birth;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getPolilook() {
        return poli_look;
    }

    @Override
    public String toString() {
        return  "用户ID:" + id +
                ", 姓名:'" + name +
                ", 性别:'" + gender +
                ", 年龄:'" + age +
                ", 生日:'" + birth +
                ", 邮箱:'" + email +
                ", 电话:'" + phone +
                ", 政治面貌:'" + poli_look ;
    }
}
