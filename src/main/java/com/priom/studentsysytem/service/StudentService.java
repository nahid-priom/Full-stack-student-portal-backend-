package com.priom.studentsysytem.service;

import com.priom.studentsysytem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent (Student student);
    public List<Student> getAllStudents();
}
