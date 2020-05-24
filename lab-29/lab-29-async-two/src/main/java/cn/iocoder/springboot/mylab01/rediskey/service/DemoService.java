package cn.iocoder.springboot.mylab01.rediskey.service;

import cn.iocoder.springboot.mylab01.rediskey.config.AsyncConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Async(AsyncConfig.EXECUTOR_ONE_BEAN_NAME)
    public Integer execute01() {
        logger.info("[execute01]");
        return 1;
    }

    @Async(AsyncConfig.EXECUTOR_TWO_BEAN_NAME)
    public Integer execute02() {
        logger.info("[execute02]");
        return 2;
    }

}
