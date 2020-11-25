package org.mouatamid.service;

import org.mouatamid.annotation.ServiceGet;
import org.mouatamid.annotation.ServiceSet;
import org.mouatamid.model.Student;

public class StudentService {
    private Student student;
    @ServiceGet
    public Student getStudent() {
        return student;
    }
    @ServiceSet
    public void setStudent(Student student) {
        this.student = student;
    }
}
