package com.redis;

import redis.clients.jedis.Jedis;

/**
 * Created by pan on 16/8/18.
 */
public class RedisUtil {
    static Jedis jedis;
    static{
        jedis = new Jedis("localhost",6379);
    }

    public void testString(){
        jedis.set("name","xinxin");//��key-->name�з�����value-->xinxin
        System.out.println(jedis.get("name"));//ִ�н����xinxin
    }

    public static void main(String[] args){
        new RedisUtil().testString();
    }

}
