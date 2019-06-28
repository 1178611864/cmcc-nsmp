package com.ultrapower.utils;

import org.springframework.data.redis.core.RedisTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * 主键工具类
 */
public class PkUtils {

    /**
     * 生成一个32为字符串UUID
     *
     * @return
     */
    public static String getPrimaryKey() {
        String s = UUID.randomUUID().toString().replace("-", "");
        return s;
    }

    public static String getUserIdByToken(String token, RedisTemplate redisTemplate) {
        //token == uuid
        //token_c030af3d9e73458f83b63080ed8c82f6
        String uid = (String) redisTemplate.boundHashOps("session").get("token_" + token);
        return uid;
    }


    public static void main(String[] args) {
        System.out.println(getPrimaryKey());
    }

}
