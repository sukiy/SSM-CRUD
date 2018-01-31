package com.mybatis.dao;

import com.mybatis.entity.TbStu;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by Sukiy on 2018/1/30.
 */
public interface StuDao {

    @Insert("insert into tb_stu(sname,sage,scno) values(#{sname},#{sage},#{tbClass.cno})")
    boolean addStu(TbStu stu);

    @Select("select * from tb_stu s,tb_class c where s.scno=c.cno")
    @ResultMap("com.mybatis.dao.StuDao.stuMap")
    List findStuList();

    @Select("select * from tb_stu s,tb_class c where s.scno=c.cno and sno=#{sno}")
    @ResultMap("com.mybatis.dao.StuDao.stuMap")
    TbStu findStuById(int id);

    @Update("update tb_stu set sname=#{sname},sage=#{sage},scno=#{tbClass.cno} where sno=#{sno}")
    @ResultMap("com.mybatis.dao.StuDao.stuMap")
    boolean updateStu(TbStu stu);

    @Delete("delete from tb_stu where sno=#{sno}")
    boolean deleteStu(TbStu stu);

}
