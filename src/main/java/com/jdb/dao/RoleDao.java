package com.jdb.dao;

import com.jdb.model.Role;
import com.jdb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author：sdh
 * @description：
 * @date：
 * @version： 1.0
 */
public interface RoleDao extends JpaRepository<Role,Integer> {


}
