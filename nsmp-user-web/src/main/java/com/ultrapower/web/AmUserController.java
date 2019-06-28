package com.ultrapower.web;

import com.ultrapower.pojo.AmUser;
import com.ultrapower.pojo.LoginResultVO;
import com.ultrapower.service.AmUserService;
import com.ultrapower.utils.PkUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@RestController
public class AmUserController {

    @Autowired
    AmUserService userService;

    @Autowired
    RedisTemplate redisTemplate;

    @PostMapping("/userlogin")
    public LoginResultVO amUserLogin(AmUser user, HttpServletResponse response){
        /*if(user==null || user.getUserAccount()==null||user.getUserAccount().equals("")||
                user.getUserPassword().equals())*/
        LoginResultVO loginResultVO = userService.amUserLogin(user);
        //如果账号密码校验通过，向redis和cookie写数据

        //浏览器cookie   token   uuid
        //redis: token_uuid  当前用户的信息
        if (loginResultVO.getCode() == 1){

            String uuid = PkUtils.getPrimaryKey();

            Cookie cookie = new Cookie("token",uuid);
            cookie.setMaxAge(-1);
            cookie.setPath("/");

            response.addCookie(cookie);

            //保存用户id 和 用户名
            Cookie userAccount = new Cookie("userAccount",loginResultVO.getUser().getUserAccount());
            userAccount.setPath("/");
            userAccount.setMaxAge(-1);

            Cookie pkNsmpUser = new Cookie("pkNsmpUser",loginResultVO.getUser().getPkNsmpUser());
            pkNsmpUser.setPath("/");
            pkNsmpUser.setMaxAge(-1);

            response.addCookie(userAccount);
            response.addCookie(pkNsmpUser);

            String key = "token_"+uuid;
            redisTemplate.boundHashOps("session").put(key,loginResultVO.getUser().getPkNsmpUser());

        }

        return loginResultVO;
    }

}
