/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.account;

/**
 *
 * @author ASUS
 */
public class TeacherAccount {

    private String ussername;
    private String password;
    private String email;
    private String teacherID;

    public TeacherAccount() {
    }

    public TeacherAccount(String ussername, String password, String email, String teacherID) {
        this.ussername = ussername;
        this.password = password;
        this.email = email;
        this.teacherID = teacherID;
    }

    public String getUssername() {
        return ussername;
    }

    public void setUssername(String ussername) {
        this.ussername = ussername;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

}
