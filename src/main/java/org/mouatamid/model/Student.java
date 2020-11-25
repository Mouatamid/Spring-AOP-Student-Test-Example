package org.mouatamid.model;


import org.mouatamid.annotation.ModelGet;
import org.mouatamid.annotation.ModelSet;

public class Student {
    private String studentId;
    private String name;
    private int age;

    @ModelGet
    public String getStudentId() {
        return studentId;
    }
    @ModelSet
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    @ModelGet
    public String getName() {
        return name;
    }
    @ModelSet
    public void setName(String name) {
        this.name = name;
    }
    @ModelGet
    public int getAge() {
        return age;
    }
    @ModelSet
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString(){
        String string = "";
        string = string + "This is for around advice toString() : name : ";
        string = string + this.name + " - age : " + this.age;
        string = string + " - Id : " + this.studentId;
        return string;
    }


}
