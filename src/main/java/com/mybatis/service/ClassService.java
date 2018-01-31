package com.mybatis.service;

import com.mybatis.dao.ClassDao;
import com.mybatis.entity.TbClass;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Sukiy on 2018/1/30.
 */
@Service("classService")
@Transactional(propagation = Propagation.REQUIRED)
public class ClassService {

    @Resource
    private ClassDao classDao;

    public boolean addCls(TbClass cls){
        return classDao.addClass(cls);
    }

    public List<TbClass> findClsList(){
        return classDao.findClsList();
    }

    public ClassDao getClassDao() {
        return classDao;
    }

    public void setClassDao(ClassDao classDao) {
        this.classDao = classDao;
    }
}
