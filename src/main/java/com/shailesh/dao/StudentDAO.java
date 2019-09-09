package com.shailesh.dao;

import com.shailesh.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDAO {

    private static Map<Integer, Student> students;

    static {
        students= new HashMap<Integer, Student>(){
            {
                put(1, new Student(1, "shailesh", "Java"));
                put(2, new Student(2, "rajendra", "computer science"));
                put(3, new Student(3, "snehal", "machine learning"));
            }

        };
    }

    public Collection<Student> getAllStudents(){
        return this.students.values();
    }
}
