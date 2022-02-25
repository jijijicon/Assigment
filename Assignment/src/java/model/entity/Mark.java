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
public class Mark {
    private Student studentid;
    private Subject subjectid;
    private int smalltest1;
    private int bigltest1;
    private int finaltest1;
    private int smalltest2;
    private int bigtest2;
    private int finalltest2;
    
    public Mark() {
    }

    public Student getStudentid() {
        return studentid;
    }

    public void setStudentid(Student studentid) {
        this.studentid = studentid;
    }

    public Subject getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(Subject subjectid) {
        this.subjectid = subjectid;
    }

    public int getSmalltest1() {
        return smalltest1;
    }

    public void setSmalltest1(int smalltest1) {
        this.smalltest1 = smalltest1;
    }

    public int getBigltest1() {
        return bigltest1;
    }

    public void setBigltest1(int bigltest1) {
        this.bigltest1 = bigltest1;
    }

    public int getFinaltest1() {
        return finaltest1;
    }

    public void setFinaltest1(int finaltest1) {
        this.finaltest1 = finaltest1;
    }

    public int getSmalltest2() {
        return smalltest2;
    }

    public void setSmalltest2(int smalltest2) {
        this.smalltest2 = smalltest2;
    }

    public int getBigtest2() {
        return bigtest2;
    }

    public void setBigtest2(int bigtest2) {
        this.bigtest2 = bigtest2;
    }

    public int getFinalltest2() {
        return finalltest2;
    }

    public void setFinalltest2(int finalltest2) {
        this.finalltest2 = finalltest2;
    }

    
}
