package com.celivra.personnalms.Entity;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class People {
    private String id ,name ,gender ,age ,birth ,email ,phone ,poli_look;

    public People() {}

    public People(String name, String gender, String birth, String email, String phone, String poli_look) {
        this.name = name;
        this.gender = gender;
        this.birth = SafeDate(birth);
        this.age = String.valueOf(calculateAge(this.birth));
        this.email = email;
        this.phone = SafePhone(phone);
        this.poli_look = poli_look;
    }

    public People(String id, String name, String gender, String birth, String email, String phone, String poli_look) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birth = SafeDate(birth);
        this.age = String.valueOf(calculateAge(this.birth));
        this.email = email;
        this.phone = SafePhone(phone);
        this.poli_look = poli_look;
    }
    private String SafeDate(String date) {
        String[] birthDates = date.split("-");
        if(birthDates[0].length() >= 5) {
            date= birthDates[0].substring(0,4)+"-"+birthDates[1]+"-"+birthDates[2];
            System.out.println("birthDateStr: " + date);
        }
        return date;
    }
    private String SafePhone(String phone) {
        StringBuilder safePhone = new StringBuilder(phone);
        for (int i = 0; i < safePhone.length(); i++) {
            if (!Character.isDigit(safePhone.charAt(i))) {
                safePhone.setCharAt(i, '0'); // 直接修改
            }
        }
        return safePhone.toString();
    }
    //日期轉年齡
    private int calculateAge(String birthDateStr) {
        // 1. 定义日期格式（和你的字符串格式匹配）
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        // 2. 把 String 转换成 LocalDate
        LocalDate birthDate = LocalDate.parse(birthDateStr, formatter);
        // 3. 获取当前日期
        LocalDate currentDate = LocalDate.now();
        // 4. 计算年龄
        int age = Period.between(birthDate, currentDate).getYears();

        return Math.max(age, 0);
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
