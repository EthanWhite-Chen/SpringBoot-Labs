package cn.iocoder.springboot.mylab01.rediskey;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo {

  public static void main(String[] args) {
    // 创建线程池。
    ExecutorService executor = Executors.newFixedThreadPool(10);

    // 提交任务到线程池中执行。
    for (int i = 0; i < 20; i++) {
      executor.submit(new Runnable() {
        @Override
        public void run() {
          System.out.println(Thread.currentThread().toString());
          System.out.println("异步调用测试");
        }

      });
    }
  }

}
