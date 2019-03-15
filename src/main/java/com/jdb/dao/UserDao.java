package com.jdb.dao;

import com.jdb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author：sdh
 * @description：
 * @date：
 * @version： 1.0
 */
public interface UserDao  extends JpaRepository<User,Integer> {


    /**功能描述:根据用户名查找用户
     *@Author：sdh
     *@Description
     *@Param [username]
     *@Date 2019/3/15 13:42
     *@Return com.jdb.model.User
     **/
    User findByUsername(String username);
}
