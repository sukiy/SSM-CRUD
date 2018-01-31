package com.mybatis.entity;

/**
 * Created by Sukiy on 2018/1/30.
 */
public class TbStu {

    private int sno;
    private String sname;
    private int sage;

    //多个学生对应一个班级
    private TbClass tbClass;

    public TbStu() {
    }

    public TbStu(int sno, String sname, int sage) {
        this.sno = sno;
        this.sname = sname;
        this.sage = sage;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }

    public TbClass getTbClass() {
        return tbClass;
    }

    public void setTbClass(TbClass tbClass) {
        this.tbClass = tbClass;
    }
}
