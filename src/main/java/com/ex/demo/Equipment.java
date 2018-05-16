package com.ex.demo;

import javax.persistence.*;
//
@Entity
public class Equipment {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long seq;
    private String eq_name;
    private String type;
    private String s_num;


    public long getSeq() {
        return seq;
    }

    public void setSeq(long seq) {
        this.seq = seq;
    }

    public String getEq_name() {
        return eq_name;
    }

    public void setEq_name(String eq_name) {
        this.eq_name = eq_name;
    }

    public String getS_num() {
        return s_num;
    }

    public void setS_num(String s_num) {
        this.s_num = s_num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
