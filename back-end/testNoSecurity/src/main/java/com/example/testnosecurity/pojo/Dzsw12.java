package com.example.testnosecurity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 
 * @TableName dzsw12
 */
@TableName(value ="dzsw12")
public class Dzsw12 implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer id;

    /**
     * 软件技术系
     */
    private String stuUnit;

    /**
     * 21101+21102
     */
    private String stuClass;

    /**
     * 
     */
    private String monday;

    /**
     * 
     */
    private String tuseday;

    /**
     * 
     */
    private String wednesday;

    /**
     * 
     */
    private String thursday;

    /**
     * 
     */
    private String friday;

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
     * 21101+21102
     */
    public String getStuClass() {
        return stuClass;
    }

    /**
     * 21101+21102
     */
    public void setStuClass(String stuClass) {
        this.stuClass = stuClass;
    }

    /**
     * 
     */
    public String getMonday() {
        return monday;
    }

    /**
     * 
     */
    public void setMonday(String monday) {
        this.monday = monday;
    }

    /**
     * 
     */
    public String getTuseday() {
        return tuseday;
    }

    /**
     * 
     */
    public void setTuseday(String tuseday) {
        this.tuseday = tuseday;
    }

    /**
     * 
     */
    public String getWednesday() {
        return wednesday;
    }

    /**
     * 
     */
    public void setWednesday(String wednesday) {
        this.wednesday = wednesday;
    }

    /**
     * 
     */
    public String getThursday() {
        return thursday;
    }

    /**
     * 
     */
    public void setThursday(String thursday) {
        this.thursday = thursday;
    }

    /**
     * 
     */
    public String getFriday() {
        return friday;
    }

    /**
     * 
     */
    public void setFriday(String friday) {
        this.friday = friday;
    }
}