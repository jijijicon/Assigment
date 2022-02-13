/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entity;

/**
 *
 * @author ASUS
 */
public class Class {
    private String classID;
    private String teacherID;
    private int gradeID;

    public Class() {
    }

    public Class(String classID, String teacherID, int gradeID) {
        this.classID = classID;
        this.teacherID = teacherID;
        this.gradeID = gradeID;
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public int getGradeID() {
        return gradeID;
    }

    public void setGradeID(int gradeID) {
        this.gradeID = gradeID;
    }
    
}
