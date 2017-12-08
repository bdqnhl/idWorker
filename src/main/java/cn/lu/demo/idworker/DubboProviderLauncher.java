package cn.lu.demo.idworker;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@DubboComponentScan("cn.lu.demo.idworker.service")
public class DubboProviderLauncher {
	public static void main(String[] args) {
		SpringApplication.run(DubboProviderLauncher.class, args);
	}
}
