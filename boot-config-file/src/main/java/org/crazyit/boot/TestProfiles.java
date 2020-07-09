package org.crazyit.boot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TestProfiles {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = new SpringApplicationBuilder(
				TestProfiles.class)
				.properties(
						"spring.config.location=classpath:/test-profiles.yml")
				.properties("spring.profiles.active=oracle").run(args);
		// 输出变量
		System.out.println(context.getEnvironment().getProperty("jdbc.driver"));
		// 启动第二个Spring容器，指定端口为8081
		// 我自己尝试时，上面80端口的启动成功，下面81启动失败
		ConfigurableApplicationContext context2 = new SpringApplicationBuilder(
				TestProfiles.class)
				.properties(
						"spring.config.location=classpath:/test-profiles.yml")
				.properties("spring.profiles.active=mysql").properties("server.port=8081").run(args);
		// 输出变量
		System.out.println(context2.getEnvironment().getProperty("jdbc.driver"));
	}

}
