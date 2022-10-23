package com.Sajal.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class parameters {


    private int roll_no;
    private String name;
    private int marks;
@Id
    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
