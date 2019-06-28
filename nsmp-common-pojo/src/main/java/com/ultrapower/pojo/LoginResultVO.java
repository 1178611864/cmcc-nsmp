package com.ultrapower.pojo;

import java.io.Serializable;

public class LoginResultVO implements Serializable {

    private Integer code;  // 1,登录成功    2，用户名不存在   3，密码错误
    private String msg;
    private AmUser user;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public AmUser getUser() {
        return user;
    }

    public void setUser(AmUser user) {
        this.user = user;
    }

    public LoginResultVO() {
    }

    public LoginResultVO(Integer code, String msg, AmUser user) {
        this.code = code;
        this.msg = msg;
        this.user = user;
    }
}
