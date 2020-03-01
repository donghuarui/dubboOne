package org.dhr.one.server;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * DubboProviderApplication
 * 服务提供启动类
 *
 * @author xiaoze
 * @date 2018/6/7
 */
@EnableDubbo(scanBasePackages = "org.dhr.one.server.service")
@MapperScan("org.dhr.one.model.mapper")//告诉mapper所在的包名
@SpringBootApplication
public class DubboProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApplication.class, args);
    }
}
