package com.lf.entity;

/**
 * @ClassName: Student
 * @Description:
 * @Author: 李峰
 * @Date: 2021 年 02月 07 21:51
 * @Version 1.0
 */
public class Student {
    private  Integer id;
    private  String name;
    private  String email;
    private  Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
