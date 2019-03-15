package com.jdb.dao;

import com.jdb.model.Function;
import com.jdb.model.Role;
import com.jdb.model.RoleFunction;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author：sdh
 * @description：
 * @date：
 * @version： 1.0
 */
public interface RoleFunctionDao extends JpaRepository<RoleFunction,Integer> {


}
