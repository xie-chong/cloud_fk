package org.crazyit.cloud;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class FirstServerApplication {

	public static void main(String[] args) {
		// 读取控制台输入作为端口参数
		Scanner scan = new Scanner(System.in);
		String port = scan.nextLine();
		// 设置启动的服务器端口
		new SpringApplicationBuilder(FirstServerApplication.class).properties(
				"server.port=" + port).run(args);
	}
}
