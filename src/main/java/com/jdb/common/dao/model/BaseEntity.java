package com.jdb.common.dao.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Copyright (c) 2018$. ddyunf.com all rights reserved
 *
 * @author Homvee.Tang(tanghongwei@ddcloudf.com)
 * @version V1.0
 * @Description TODO(用一句话描述该文件做什么)
 * @date 2018-01-04 18:30
 */
@MappedSuperclass
public class BaseEntity implements Serializable {

    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    protected Integer id;

    /**
     * @see
     *
     * 1:有效,0无效
     */
    protected Integer yn = 1;

    /**
     * 创建人
     */
    protected String creator;

    /**
     * 创建时间
     */
    protected Date createTime;

    /**
     * 修改人
     */
    protected String changer;

    /**
     * 修改时间
     */
    protected Date changeTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYn() {
        return yn;
    }

    public void setYn(Integer yn) {
        this.yn = yn;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreateTime() {
        return createTime == null ? new Date() : createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getChanger() {
        return changer;
    }

    public void setChanger(String changer) {
        this.changer = changer;
    }

    public Date getChangeTime() {
        return changeTime;
    }

    public void setChangeTime(Date changeTime) {
        this.changeTime = changeTime;
    }

    public BaseEntity() {
        this.yn = 1;
        this.createTime = new Date();
    }
}
