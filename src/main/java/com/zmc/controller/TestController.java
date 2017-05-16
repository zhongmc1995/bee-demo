package com.zmc.controller;

import com.zmc.bean.Student;
import com.zmc.bee.framework.web.annotaion.Controller;
import com.zmc.bee.framework.web.annotaion.Router;

import com.zmc.bee.framework.web.request.Param;
import com.zmc.bee.framework.web.view.View;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by zhongmc on 2017/5/16.
 */
@Controller
public class TestController {

    @Router("get:/hello")
    public View hello(Param param){
        View view = new View("hello.jsp");
        Student student = new Student();
        student.setId("0001");
        student.setName("张三");
        student.setGender("男");
        student.setSex("女");
        Map<String,Object> m = new HashMap<>();
        m.put("student",student);
        view.setModel(m);
        return view;
    }
}
