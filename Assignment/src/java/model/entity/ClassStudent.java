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
public class ClassStudent {
    private String classID;
    private String teacherID;
    private Grade gradeID;

    public ClassStudent() {
    }

    public ClassStudent(String classID, String teacherID, Grade gradeID) {
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

    public Grade getGradeID() {
        return gradeID;
    }

    public void setGradeID(Grade gradeID) {
        this.gradeID = gradeID;
    }

   
}
