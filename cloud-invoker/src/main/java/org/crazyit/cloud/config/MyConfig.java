package org.crazyit.cloud.config;

import org.crazyit.cloud.MyPing;
import org.crazyit.cloud.MyRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;

public class MyConfig {
	@Bean
	public IRule getRule() {
		return new MyRule();
	}
	@Bean
	public IPing getPing() {
		return new MyPing();
	}
}
