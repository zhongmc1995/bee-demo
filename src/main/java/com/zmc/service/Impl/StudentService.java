package com.zmc.service.Impl;

import com.zmc.bean.Student;
import com.zmc.bee.framework.web.annotaion.Service;
import com.zmc.service.IStudentService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhongmc on 2017/5/17.
 */
@Service
public class StudentService{
    public List<Student> getAllStudent() {
        List<Student> students = new ArrayList<>();
        Student s1 = new Student("0001","zhangsan","男","man");
        Student s2 = new Student("0002","lisi","男","man");
        Student s3 = new Student("0003","wanger","男","man");
        Student s4 = new Student("0004","jack","男","man");
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        return students;
    }
}
