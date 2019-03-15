package com.jdb.action.user;

import com.jdb.common.web.ctrls.BaseCtrl;
import com.jdb.common.web.vo.Msg;
import com.jdb.model.User;
import com.jdb.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author：sdh
 * @description：
 * @date：
 * @version： 1.0
 */
@Controller
@RequestMapping(value = "/user")
public class UserCtrl extends BaseCtrl {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/save",method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public Msg saveUser(String username,String password,String link){
        if(StringUtils.isEmpty(username) || StringUtils.isEmpty(password) || StringUtils.isEmpty(link)){
            return Msg.error("参数错误");
        }
        try {
            User user = userService.saveUser(username, password, link);
            return Msg.success();
        } catch (Exception e) {
            e.printStackTrace();
            LOGGER.error("保存用户异常");
            return Msg.error("保存异常");
        }
    }

}
