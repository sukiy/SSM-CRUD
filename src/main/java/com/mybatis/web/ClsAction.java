package com.mybatis.web;

import com.mybatis.entity.TbClass;
import com.mybatis.service.ClassService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by Sukiy on 2018/1/30.
 */
@Controller
@RequestMapping("/clsAction")
public class ClsAction {

    @Resource(name="classService")
    private ClassService classService;



    @RequestMapping("/addCls")
    public String addCls(TbClass cls){
        if (classService.addCls(cls)){
            System.out.println("添加班级成功");
        }else {
            System.out.println("添加失败");
        }
        return "redirect:/addCls.jsp";
    }


    public ClassService getClassService() {
        return classService;
    }

    public void setClassService(ClassService classService) {
        this.classService = classService;
    }
}
