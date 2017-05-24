/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pro.Model;

/**
 *
 * @author Akshay
 */
public class Patient  {
    
    private String pid;
    private String ageGroup;
    private String gender;

    @Override
    public String toString() {
        return "Patient{" + "pid=" + pid + ", ageGroup=" + ageGroup + ", gender=" + gender + '}';
    }

    public Patient(String pid, String ageGroup, String gender) {
        this.pid = pid;
        this.ageGroup = ageGroup;
        this.gender = gender;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
}
