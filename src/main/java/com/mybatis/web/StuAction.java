package com.mybatis.web;

import com.mybatis.entity.TbStu;
import com.mybatis.service.ClassService;
import com.mybatis.service.StuService;
import org.apache.ibatis.annotations.ResultMap;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sukiy on 2018/1/30.
 */
@Controller
@RequestMapping("/stuAction")
public class StuAction {

    @Resource(name = "stuService")
    private StuService stuService;
    @Resource(name = "classService")
    private ClassService classService;

    @RequestMapping("/toAdd")
    public String toAdd(ModelMap map){
        map.put("clsList",classService.findClsList());
        return "addStu";
    }

    @RequestMapping("/addStu")
    public String addStu(TbStu stu){
        if (stuService.addStu(stu)){
            System.out.println("添加学生成功");
        }else {
            System.out.println("添加学生失败");
        }
        return "redirect:toAdd";
    }

    @RequestMapping("/findStuList")
    public String findStuList(ModelMap map){
        map.put("stuList",stuService.findStuList());
        return "main";

    }

    @RequestMapping("/toUpdate")
    @ResponseBody
    public Object toUpdate(int id){//先查询出班级
        Map data = new HashMap();
        //我之所以用map封装这两个值，就是因为map的键值对形式在页面取值的时候比较方便，当然，你也可以用别的形式
        data.put("stu", stuService.findStuById(id));
        data.put("clsList", classService.findClsList());

        return data;
    }

    @RequestMapping("/updateStu")
    public String updateStu(TbStu stu){
        if (stuService.updateStu(stu)){
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }
        return "redirect:/stuAction/findStuList";
    }

    @RequestMapping("/deleteStu")
    public String deleteStu(TbStu stu){
        if (stuService.deleteStu(stu)){
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }
        return "redirect:/stuAction/findStuList";
    }
    public StuService getStuService() {
        return stuService;
    }

    public void setStuService(StuService stuService) {
        this.stuService = stuService;
    }
}
