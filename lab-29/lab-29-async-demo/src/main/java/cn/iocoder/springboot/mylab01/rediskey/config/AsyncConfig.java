package cn.iocoder.springboot.mylab01.rediskey.config;

import cn.iocoder.springboot.mylab01.rediskey.core.rediskey.GlobalAsyncExceptionHandler;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.concurrent.Executor;

@Configuration
@EnableAsync // 开启 @Async 的支持,可以去掉启动类的@EnableAsync
public class AsyncConfig implements AsyncConfigurer {

    @Autowired
    private GlobalAsyncExceptionHandler exceptionHandler;

    @Override
    public Executor getAsyncExecutor() {
        return null;
    }

    @Override
    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return exceptionHandler;
    }

}
