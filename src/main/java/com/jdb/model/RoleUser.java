package com.jdb.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author：sdh
 * @description：
 * @date：
 * @version： 1.0
 */
@Entity
@Table(name = "jdb_role_user")
public class RoleUser implements Serializable {


    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    protected Integer id;

    @Column(name="roleId")
    protected Integer roleId;

    @Column(name="userId")
    protected Integer userId;

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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "RoleUser{" +
                "id=" + id +
                ", roleId=" + roleId +
                ", userId=" + userId +
                '}';
    }
}
