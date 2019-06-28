package com.ultrapower.service;

import com.ultrapower.pojo.AmUser;
import com.ultrapower.pojo.LoginResultVO;

public interface AmUserService {

    /**
     * 用户登录
     * @param user
     * @return
     */
    public LoginResultVO amUserLogin(AmUser user);

}
