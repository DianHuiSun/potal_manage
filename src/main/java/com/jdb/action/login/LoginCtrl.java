package com.jdb.action.login;

import com.jdb.common.web.ctrls.BaseCtrl;
import com.jdb.common.web.vo.Msg;
import com.jdb.model.User;
import com.jdb.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author：sdh
 * @description：
 * @date：
 * @version： 1.0
 */
@Controller
@RequestMapping(value = "/login")
public class LoginCtrl extends BaseCtrl {


    @Resource
    private UserService userService;

    @RequestMapping(value = "/loginByUsername",method = {RequestMethod.GET,RequestMethod.POST})
    public String loginByUsername(HttpServletRequest request,User user, Model model){
        User temUser = userService.findByUsername(user.getUsername());
        if(temUser == null){
            model.addAttribute("message","用户不存在");
            return "login";
        }
        model.addAttribute("userId",temUser.getId());
        if(!user.getPassword().equals(temUser.getPassword())){
            model.addAttribute("message","密码错误");
            return "login";
        }
        model.addAttribute("message","登录成功");
        return "index";
    }
}
