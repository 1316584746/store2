package com.mgb.pojo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 标准javaBean的格式:
 */
@Component
public class User {
@Value("狐狸")
    private  String name;
    private  Integer age;
    private  String gender;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
