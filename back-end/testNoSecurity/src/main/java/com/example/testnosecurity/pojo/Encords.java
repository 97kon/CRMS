package com.example.testnosecurity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName encords
 */
@TableName(value ="encords")
public class Encords implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer id;

    /**
     * 学生的学号，和user表student表相关联
     */
    private String stuId;

    /**
     * 申请的单位（例：软件技术系）
     */
    private String applyUnit;

    /**
     * 申请的日期（例：2023/4/9）
     */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date applyDay;

    /**
     * 申请的时刻（例：第一大节）
     */
    private String applyTime;

    /**
     * 申请人的班级（例：21101班）
     */
    private String applyStuClass;

    /**
     * 学生人数
     */
    private Integer applyPeopleNum;

    /**
     * 需要的教室数量
     */
    private Integer applyClassNum;

    /**
     * 申请的是哪个教室（例：A7-202）
     */
    private String applyClass;

    /**
     * 申请人名字（例：刘启铭）
     */
    private String applyUser;

    /**
     * 申请人联系电话
     */
    private String applyPhone;

    /**
     * 申请使用原因说明
     */
    private String applyReason;

    /**
     * 当前申请的状态
     */
    private Integer status;

    /**
     * 保安处验证码
     */
    private String verifyCode;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 学生的学号，和user表student表相关联
     */
    public String getStuId() {
        return stuId;
    }

    /**
     * 学生的学号，和user表student表相关联
     */
    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    /**
     * 申请的单位（例：软件技术系）
     */
    public String getApplyUnit() {
        return applyUnit;
    }

    /**
     * 申请的单位（例：软件技术系）
     */
    public void setApplyUnit(String applyUnit) {
        this.applyUnit = applyUnit;
    }

    /**
     * 申请的日期（例：2023/4/9）
     */
    public Date getApplyDay() {
        return applyDay;
    }

    /**
     * 申请的日期（例：2023/4/9）
     */
    public void setApplyDay(Date applyDay) {
        this.applyDay = applyDay;
    }

    /**
     * 申请的时刻（例：第一大节）
     */
    public String getApplyTime() {
        return applyTime;
    }

    /**
     * 申请的时刻（例：第一大节）
     */
    public void setApplyTime(String applyTime) {
        this.applyTime = applyTime;
    }

    /**
     * 申请人的班级（例：21101班）
     */
    public String getApplyStuClass() {
        return applyStuClass;
    }

    /**
     * 申请人的班级（例：21101班）
     */
    public void setApplyStuClass(String applyStuClass) {
        this.applyStuClass = applyStuClass;
    }

    /**
     * 学生人数
     */
    public Integer getApplyPeopleNum() {
        return applyPeopleNum;
    }

    /**
     * 学生人数
     */
    public void setApplyPeopleNum(Integer applyPeopleNum) {
        this.applyPeopleNum = applyPeopleNum;
    }

    /**
     * 需要的教室数量
     */
    public Integer getApplyClassNum() {
        return applyClassNum;
    }

    /**
     * 需要的教室数量
     */
    public void setApplyClassNum(Integer applyClassNum) {
        this.applyClassNum = applyClassNum;
    }

    /**
     * 申请的是哪个教室（例：A7-202）
     */
    public String getApplyClass() {
        return applyClass;
    }

    /**
     * 申请的是哪个教室（例：A7-202）
     */
    public void setApplyClass(String applyClass) {
        this.applyClass = applyClass;
    }

    /**
     * 申请人名字（例：刘启铭）
     */
    public String getApplyUser() {
        return applyUser;
    }

    /**
     * 申请人名字（例：刘启铭）
     */
    public void setApplyUser(String applyUser) {
        this.applyUser = applyUser;
    }

    /**
     * 申请人联系电话
     */
    public String getApplyPhone() {
        return applyPhone;
    }

    /**
     * 申请人联系电话
     */
    public void setApplyPhone(String applyPhone) {
        this.applyPhone = applyPhone;
    }

    /**
     * 申请使用原因说明
     */
    public String getApplyReason() {
        return applyReason;
    }

    /**
     * 申请使用原因说明
     */
    public void setApplyReason(String applyReason) {
        this.applyReason = applyReason;
    }

    /**
     * 当前申请的状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 当前申请的状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 保安处验证码
     */
    public String getVerifyCode() {
        return verifyCode;
    }

    /**
     * 保安处验证码
     */
    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }
}