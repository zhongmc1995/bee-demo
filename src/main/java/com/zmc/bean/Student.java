package com.zmc.bean;

/**
 * Created by zhongmc on 2017/5/16.
 */
public class Student {
    private String id;
    private String name;
    private String gender;
    private String sex;

    public Student(String id, String name, String gender, String sex) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.sex = sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
