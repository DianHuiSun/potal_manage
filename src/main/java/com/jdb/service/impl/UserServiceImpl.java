package com.jdb.service.impl;

import com.jdb.common.service.impl.BaseServiceImpl;
import com.jdb.dao.UserDao;
import com.jdb.model.User;
import com.jdb.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.Date;

/**
 * @author：sdh
 * @description：
 * @date：
 * @version： 1.0
 */
@Service("UserService")
public class UserServiceImpl extends BaseServiceImpl<User,Integer> implements UserService{
    @Resource
    private UserDao userDao;
    @Override
    public User saveUser(String username, String password, String link) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setLink(link);
        user.setChangeTime(new Date());
        user.setCreateTime(new Date());
        user.setCreator("admin");
        user.setChanger("admin");
        user.setYn(1);
        User save = userDao.save(user);
        return save;
    }

    @Override
    public User findByUsername(String username) {
        return userDao.findByUsername(username);
    }
}
