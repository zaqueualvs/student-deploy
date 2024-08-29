package com.alves.student.model;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private float firstNote;
    private Integer age;
    private float secondNote;
    private String teacherName;
    private int roomNumber;

    public Student() {
    }

    public Student(Long id, String name, float firstNote, Integer age, float secondNote, String teacherName, int roomNumber) {
        this.id = id;
        this.name = name;
        this.firstNote = firstNote;
        this.age = age;
        this.secondNote = secondNote;
        this.teacherName = teacherName;
        this.roomNumber = roomNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public float getFirstNote() {
        return firstNote;
    }

    public void setFirstNote(float firstNote) {
        this.firstNote = firstNote;
    }

    public float getSecondNote() {
        return secondNote;
    }

    public void setSecondNote(float secondNote) {
        this.secondNote = secondNote;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}
