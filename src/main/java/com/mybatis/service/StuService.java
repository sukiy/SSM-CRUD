package com.mybatis.service;

import com.mybatis.dao.StuDao;
import com.mybatis.entity.TbStu;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Sukiy on 2018/1/30.
 */
@Service("stuService")
@Transactional(propagation = Propagation.REQUIRED)
public class StuService {

    @Resource
    private StuDao stuDao;

    /**
     * 添加学生的方法
     * @param stu
     * @return
     */
    public boolean addStu(TbStu stu){
        return stuDao.addStu(stu);
    }

    /**
     * 查询学生的方法
     * @return
     */
    public List findStuList(){
        return stuDao.findStuList();
    }

    /**
     * 根据id查询学生
     * @param id
     * @return
     */
    public TbStu findStuById(int id){
        return stuDao.findStuById(id);
    }


    /**
     * 修改学生
     * @param stu
     * @return
     */
    public boolean updateStu(TbStu stu){
        return stuDao.updateStu(stu);
    }

    /**
     * 删除学生
     * @param stu
     * @return
     */
    public boolean deleteStu(TbStu stu){
        return stuDao.deleteStu(stu);
    }

    public StuDao getStuDao() {
        return stuDao;
    }

    public void setStuDao(StuDao stuDao) {
        this.stuDao = stuDao;
    }
}
