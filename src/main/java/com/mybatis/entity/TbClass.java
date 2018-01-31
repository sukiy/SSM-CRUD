package com.mybatis.entity;

/**
 * Created by Sukiy on 2018/1/30.
 */
public class TbClass {

    private int cno;
    private String cname;

    public TbClass() {
    }

    public TbClass(int cno, String cname) {
        this.cno = cno;
        this.cname = cname;
    }

    public int getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
