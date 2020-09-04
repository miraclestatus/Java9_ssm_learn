package com.neusoft.domain;

import java.util.Date;

/**
 * @author Joker_Dong
 * @date 2020-9-4 9:53
 */

public class Emp {
    private int EMPNO;
    private String ENAME;
    private String JOB;
    private Integer MGR;
    private Date HIREDATE;
    private int SAL;
    private int COMM;
    private int DEPTNO;

    public int getEMPNO() {
        return EMPNO;
    }

    public void setEMPNO(int EMPNO) {
        this.EMPNO = EMPNO;
    }

    public String getENAME() {
        return ENAME;
    }

    public void setENAME(String ENAME) {
        this.ENAME = ENAME;
    }

    public String getJOB() {
        return JOB;
    }

    public void setJOB(String JOB) {
        this.JOB = JOB;
    }

    public Integer getMGR() {
        return MGR;
    }

    public void setMGR(Integer MGR) {
        this.MGR = MGR;
    }

    public Date getHIREDATE() {
        return HIREDATE;
    }

    public void setHIREDATE(Date HIREDATE) {
        this.HIREDATE = HIREDATE;
    }

    public int getSAL() {
        return SAL;
    }

    public void setSAL(int SAL) {
        this.SAL = SAL;
    }

    public int getCOMM() {
        return COMM;
    }

    public void setCOMM(int COMM) {
        this.COMM = COMM;
    }

    public int getDEPTNO() {
        return DEPTNO;
    }

    public void setDEPTNO(int DEPTNO) {
        this.DEPTNO = DEPTNO;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "EMPNO=" + EMPNO +
                ", ENAME='" + ENAME + '\'' +
                ", JOB='" + JOB + '\'' +
                ", MGR=" + MGR +
                ", HIREDATE=" + HIREDATE +
                ", SAL=" + SAL +
                ", COMM=" + COMM +
                ", DEPTNO=" + DEPTNO +
                '}';
    }

}
