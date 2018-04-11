package com.ex.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Member
{

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long seq;
    private String name;
    private  int age;
    private String gender;
    private long stu_num;

    public long getSeq() {
        return seq;
    }

    public void setSeq(long seq) {
        this.seq = seq;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getStu_num() {
        return stu_num;
    }

    public void setStu_num(long stu_num) {
        this.stu_num = stu_num;
    }
}
