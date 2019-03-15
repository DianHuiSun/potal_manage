package com.jdb.service.impl;

import com.jdb.common.service.impl.BaseServiceImpl;
import com.jdb.dao.FunctionDao;
import com.jdb.dao.RoleDao;
import com.jdb.dao.RoleFunctionDao;
import com.jdb.model.Function;
import com.jdb.model.Role;
import com.jdb.service.FunctionService;
import com.jdb.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author：sdh
 * @description：
 * @date：
 * @version： 1.0
 */
@Service("functionService")
public class FunctionServiceImpl extends BaseServiceImpl<Function,Integer> implements FunctionService {
    @Resource
    private FunctionDao functionDao;

}
