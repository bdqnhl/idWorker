package cn.lu.demo.idworker;

import com.alibaba.boot.dubbo.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class DubboProviderLauncher {
	public static void main(String[] args) {
		SpringApplication.run(DubboProviderLauncher.class, args);
		synchronized (DubboProviderLauncher.class) {
			while (true) {
				try {
					DubboProviderLauncher.class.wait();
				} catch (InterruptedException e) {
					// swallow it
				}
			}
 		 }
	}
}
