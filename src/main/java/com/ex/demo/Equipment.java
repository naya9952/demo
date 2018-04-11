package com.ex.demo;

import javax.persistence.*;
//
@Entity
public class Equipment {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long seq;
    private String title;
    private String date;

    @ManyToOne
    @JoinColumn(name = "MEMBER_SEQ")
    private  Member member;

    public long getSeq() {
        return seq;
    }

    public void setSeq(long seq) {
        this.seq = seq;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}
