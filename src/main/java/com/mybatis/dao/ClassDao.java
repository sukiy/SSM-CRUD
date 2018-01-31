package com.mybatis.dao;

import com.mybatis.entity.TbClass;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Sukiy on 2018/1/30.
 */
public interface ClassDao {

    @Insert("insert into tb_class(cname) values(#{cname})")
    boolean addClass(TbClass tbClass);

    @Select("select * from tb_class")
    List<TbClass> findClsList();
}
