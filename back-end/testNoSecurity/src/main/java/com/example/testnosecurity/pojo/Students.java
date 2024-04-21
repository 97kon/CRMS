package com.example.testnosecurity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 
 * @TableName students
 */
@TableName(value ="students")
public class Students implements Serializable {
    /**
     * 21067010122
     */
    @TableId
    private String stuId;

    /**
     * 
     */
    private Integer id;

    /**
     * 刘启铭
     */
    private String stuName;

    /**
     * 软件技术系
     */
    private String stuUnit;

    /**
     * 21101
     */
    private String stuClass;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 21067010122
     */
    public String getStuId() {
        return stuId;
    }

    /**
     * 21067010122
     */
    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

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
     * 刘启铭
     */
    public String getStuName() {
        return stuName;
    }

    /**
     * 刘启铭
     */
    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    /**
     * 软件技术系
     */
    public String getStuUnit() {
        return stuUnit;
    }

    /**
     * 软件技术系
     */
    public void setStuUnit(String stuUnit) {
        this.stuUnit = stuUnit;
    }

    /**
     * 21101
     */
    public String getStuClass() {
        return stuClass;
    }

    /**
     * 21101
     */
    public void setStuClass(String stuClass) {
        this.stuClass = stuClass;
    }
}