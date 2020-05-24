package cn.iocoder.springboot.mylab01.rediskey.service;

import cn.iocoder.springboot.mylab01.rediskey.Application;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.concurrent.FailureCallback;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;
import org.springframework.util.concurrent.SuccessCallback;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import sun.security.jca.GetInstance.Instance;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class DemoServiceTest {

  private Logger logger = LoggerFactory.getLogger(getClass());

  @Autowired
  private DemoService demoService;

  @Test
  public void test01() {
    logger.info("开始执行test01...");
    LocalDateTime start = LocalDateTime.now();
    Map<String, Integer> map = new HashMap<>();
    demoService.addExpired();

  }


}
