package com.example.testnosecurity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 
 * @TableName monday
 */
@TableName(value ="monday")
public class Monday implements Serializable {
    /**
     * 序号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 哪个教室（例：A7-202）
     */
    private String position;

    /**
     * 第一大节（例：null）
     */
    private String one;

    /**
     * 第二大节（例：软件技术一班+软件技术二班）
     */
    private String two;

    /**
     * 第三大节（例：null）
     */
    private String three;

    /**
     * 第四大节（例：null）
     */
    private String four;

    /**
     * 第五大节（例：大数据技术一班+大数据技术二班）
     */
    private String five;

    /**
     * 该教室最大容纳人数
     */
    private Integer peopleMax;

    /**
     * 配置类型（有三类，1，2，3）
     */
    private Integer type;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 序号
     */
    public Integer getId() {
        return id;
    }

    /**
     * 序号
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 哪个教室（例：A7-202）
     */
    public String getPosition() {
        return position;
    }

    /**
     * 哪个教室（例：A7-202）
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * 第一大节（例：null）
     */
    public String getOne() {
        return one;
    }

    /**
     * 第一大节（例：null）
     */
    public void setOne(String one) {
        this.one = one;
    }

    /**
     * 第二大节（例：软件技术一班+软件技术二班）
     */
    public String getTwo() {
        return two;
    }

    /**
     * 第二大节（例：软件技术一班+软件技术二班）
     */
    public void setTwo(String two) {
        this.two = two;
    }

    /**
     * 第三大节（例：null）
     */
    public String getThree() {
        return three;
    }

    /**
     * 第三大节（例：null）
     */
    public void setThree(String three) {
        this.three = three;
    }

    /**
     * 第四大节（例：null）
     */
    public String getFour() {
        return four;
    }

    /**
     * 第四大节（例：null）
     */
    public void setFour(String four) {
        this.four = four;
    }

    /**
     * 第五大节（例：大数据技术一班+大数据技术二班）
     */
    public String getFive() {
        return five;
    }

    /**
     * 第五大节（例：大数据技术一班+大数据技术二班）
     */
    public void setFive(String five) {
        this.five = five;
    }

    /**
     * 该教室最大容纳人数
     */
    public Integer getPeopleMax() {
        return peopleMax;
    }

    /**
     * 该教室最大容纳人数
     */
    public void setPeopleMax(Integer peopleMax) {
        this.peopleMax = peopleMax;
    }

    /**
     * 配置类型（有三类，1，2，3）
     */
    public Integer getType() {
        return type;
    }

    /**
     * 配置类型（有三类，1，2，3）
     */
    public void setType(Integer type) {
        this.type = type;
    }
}