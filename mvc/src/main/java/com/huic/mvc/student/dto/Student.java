package com.huic.mvc.student.dto;

import com.huic.mvc.student.data.StudentEntity;

import java.sql.Struct;

public class Student {

    private Long id;
    private String name;
    private int age;

    public Student(){

    }

    public Student(StudentEntity entity){
        this.id = entity.getId();
        this.name = entity.getName();
        this.age = entity.getAge();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
        entity.setId(id);
        entity.setName(name);
        entity.setAge(age);
        return entity;
    }

}
