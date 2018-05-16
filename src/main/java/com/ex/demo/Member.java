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
    private String email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getStu_num() {
        return stu_num;
    }

    public void setStu_num(long stu_num) {
        this.stu_num = stu_num;
    }
}
