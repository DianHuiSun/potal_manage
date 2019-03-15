package com.jdb.service;

import com.jdb.common.service.BaseService;
import com.jdb.model.User;

/**
 * @author：sdh
 * @description：
 * @date：
 * @version： 1.0
 */
public interface UserService extends BaseService<User,Integer> {
    /**功能描述：保存用户
     *@Author：sdh
     *@Description
     *@Param [username, password, link]
     *@Date 2019/3/15 10:16
     *@Return com.jdb.model.User
     **/
    User saveUser(String username,String password,String link);

    /**功能描述:根据用户名查找用户
     *@Author：sdh
     *@Description
     *@Param [username]
     *@Date 2019/3/15 13:42
     *@Return com.jdb.model.User
     **/
    User findByUsername(String username);
}
