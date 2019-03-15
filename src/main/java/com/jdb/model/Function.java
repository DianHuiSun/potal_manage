package com.jdb.model;

import com.jdb.common.dao.model.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author：sdh
 * @description：
 * @date：
 * @version： 1.0
 */
@Entity
@Table(name = "jdb_function")
public class Function extends BaseEntity  {


    @Column(name = "functionName")
    private String functionName;
    @Column(name = "functionCode")
    private String functionCode;
    /**菜单功能层级0根菜单；1-一级菜单；2-二级菜单**/
    @Column(name = "functionLevel")
    private Integer functionLevel;

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public String getFunctionCode() {
        return functionCode;
    }

    public void setFunctionCode(String functionCode) {
        this.functionCode = functionCode;
    }

    public Integer getFunctionLevel() {
        return functionLevel;
    }

    public void setFunctionLevel(Integer functionLevel) {
        this.functionLevel = functionLevel;
    }

    @Override
    public String toString() {
        return "Function{" +
                "functionName='" + functionName + '\'' +
                ", functionCode='" + functionCode + '\'' +
                ", functionLevel=" + functionLevel +
                ", id=" + id +
                ", yn=" + yn +
                ", creator='" + creator + '\'' +
                ", createTime=" + createTime +
                ", changer='" + changer + '\'' +
                ", changeTime=" + changeTime +
                '}';
    }
}
