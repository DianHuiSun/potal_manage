package com.jdb.model;

import com.jdb.common.dao.model.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author：sdh
 * @description：
 * @date：
 * @version： 1.0
 */
@Entity
@Table(name = "jdb_role_function")
public class RoleFunction implements Serializable {


    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    protected Integer id;

    @Column(name="roleId")
    protected Integer roleId;

    @Column(name="functionId")
    protected Integer functionId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getFunctionId() {
        return functionId;
    }

    public void setFunctionId(Integer functionId) {
        this.functionId = functionId;
    }

    @Override
    public String toString() {
        return "RoleFunction{" +
                "id=" + id +
                ", roleId=" + roleId +
                ", functionId=" + functionId +
                '}';
    }
}
