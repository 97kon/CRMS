package com.example.testnosecurity.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 
 * @TableName users
 */
@TableName(value ="users")
public class Users implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer id;

    /**
     * 
     */
    private String userName;

    /**
     * 
     */
    private String pwd;

    /**
     * 
     */
    private String stuId;

    /**
     * 
     */
    private String type;

    /**
     * 
     */
    private String phone;

    /**
     * 
     */
    private String stuMail;

    /**
     * 
     */
    private String verCode;

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
     * 
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * 
     */
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * 
     */
    public String getStuId() {
        return stuId;
    }

    /**
     * 
     */
    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    /**
     * 
     */
    public String getType() {
        return type;
    }

    /**
     * 
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 
     */
    public String getStuMail() {
        return stuMail;
    }

    /**
     * 
     */
    public void setStuMail(String stuMail) {
        this.stuMail = stuMail;
    }

    /**
     * 
     */
    public String getVerCode() {
        return verCode;
    }

    /**
     * 
     */
    public void setVerCode(String verCode) {
        this.verCode = verCode;
    }
}