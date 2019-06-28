package com.ultrapower.service;

import com.ultrapower.dao.AmUserMapper;
import com.ultrapower.pojo.AmUser;
import com.ultrapower.pojo.AmUserExample;
import com.ultrapower.pojo.LoginResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AmUserServiceImpl implements AmUserService {

    @Autowired
    AmUserMapper userMapper;

    public LoginResultVO amUserLogin(AmUser user) {

        LoginResultVO loginResultVO = new LoginResultVO();
        // 1,登录成功    2，用户名不存在   3，密码错误

        //先来判断用户名是否存在
        AmUserExample amUserExample = new AmUserExample();
        AmUserExample.Criteria criteria = amUserExample.createCriteria();
        criteria.andUserAccountEqualTo(user.getUserAccount());

        List<AmUser> amUsers = userMapper.selectByExample(amUserExample);

        if(amUsers==null||amUsers.size()==0){
            //用户名不存在
            loginResultVO.setCode(2);
            loginResultVO.setMsg("用户名不存在");
            loginResultVO.setUser(user);
        }else{
            //用户名存在，校验密码
            criteria.andUserPasswordEqualTo(user.getUserPassword());
            List<AmUser> list = userMapper.selectByExample(amUserExample);//user的账号唯一
            if(list!=null && list.size()>0){
                //登录成功
                loginResultVO.setCode(1);
                loginResultVO.setMsg("登录成功");
                loginResultVO.setUser(list.get(0));//登录成功，将数据库中对应的vo存到loginResultVO
            }else{
                //密码错误
                loginResultVO.setCode(3);
                loginResultVO.setMsg("密码错误");
                loginResultVO.setUser(user);
            }
        }

        return loginResultVO;
    }
}
