package cn.iocoder.springboot.mylab01.rediskey.service;

import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @Resource
    private RedisTemplate redisTemplate;

    private Logger logger = LoggerFactory.getLogger(getClass());

    public void addExpired(Map<String,Integer> map){
        map.keySet().parallelStream().forEach(e -> {
        });

    }

}
