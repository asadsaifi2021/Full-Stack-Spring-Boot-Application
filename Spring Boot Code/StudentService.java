package com.asadsaifi.studentadministration.service;

import com.asadsaifi.studentadministration.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    public Student saveStudent(Student student);

    public List<Student> getAllStudents();
}
