package com.zmc.controller;

import com.zmc.bee.framework.web.annotaion.Controller;
import com.zmc.bee.framework.web.annotaion.Inject;
import com.zmc.bee.framework.web.annotaion.Router;
import com.zmc.bee.framework.web.data.Data;
import com.zmc.bee.framework.web.request.Param;
import com.zmc.bee.framework.web.view.View;
import com.zmc.service.Impl.StudentService;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by zhongmc on 2017/5/16.
 * 测试
 */
@Controller
public class TestController {

    @Inject
    private StudentService studentService;


    @Router("get:/hello")
    public View hello(Param param){
        View view = new View("hello.jsp");
        Map<String,Object> m = new HashMap<>();
        m.put("students",studentService.getAllStudent());
        view.setModel(m);
        return view;
    }

    @Router("get:/")
    public View index(Param param){
        return new View("index.jsp");
    }


    @Router("get:/getStudents")
    public Data listStudent(Param param){
        Data data = new Data();
        data.setModel(studentService.getAllStudent());
        return data;
    }


    @Router("post:/dologin")
    public Data loginByPost(Param param){
        Data data = new Data();
        data.setModel(param);
        return data;
    }

    @Router("get:/login")
    public View tologinPage(Param param){
        View view = new View("login.jsp");
        return view;
    }

}
