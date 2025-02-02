package com.demo.teacherwork.pojo;

/**
 * @ClassName Person
 * 人员类
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月12日  11:15:26
 * @Version 1.0.0
 */

public class Person {
    private String name;
    private String gender;
    private int age;

    public Person(){

    }
    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
