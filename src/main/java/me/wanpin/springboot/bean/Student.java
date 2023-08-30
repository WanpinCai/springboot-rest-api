package me.wanpin.springboot.bean;

import jdk.jfr.DataAmount;


public class Student {
    private int id;
    private String firstName;
    private String laetName;

    public Student(int id, String firstName, String laetName) {
        this.id = id;
        this.firstName = firstName;
        this.laetName = laetName;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLaetName() {
        return laetName;
    }

    public void setLaetName(String laetName) {
        this.laetName = laetName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", laetName='" + laetName + '\'' +
                '}';
    }
}
