package com.jdb.common.web.ctrls;

import com.jdb.common.constants.SessionKey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class BaseCtrl {
    protected Logger LOGGER = null;

    @Resource
    private HttpSession session;

    @Resource
    private HttpServletRequest request;




    public BaseCtrl() {
        LOGGER = LoggerFactory.getLogger(this.getClass());
    }

    public Object getUser(){
        return  session.getAttribute(SessionKey.USER);
    }

}
