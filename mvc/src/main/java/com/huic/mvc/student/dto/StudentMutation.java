package com.huic.mvc.student.dto;

import com.huic.mvc.student.data.StudentEntity;

public class StudentMutation {

    private String name;
    private int age;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentEntity toEntity(){
        StudentEntity entity = new StudentEntity();
        entity.setName(name);
        entity.setAge(age);
        return entity;
    }

}
