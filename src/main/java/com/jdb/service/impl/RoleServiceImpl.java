package com.jdb.service.impl;

import com.jdb.common.service.impl.BaseServiceImpl;
import com.jdb.dao.RoleDao;
import com.jdb.dao.UserDao;
import com.jdb.model.Role;
import com.jdb.model.User;
import com.jdb.service.RoleService;
import com.jdb.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author：sdh
 * @description：
 * @date：
 * @version： 1.0
 */
@Service("roleService")
public class RoleServiceImpl extends BaseServiceImpl<Role,Integer> implements RoleService{
    @Resource
    private RoleDao roleDao;

}
