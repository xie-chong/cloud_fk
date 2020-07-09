package org.crazyit.cloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

import com.netflix.appinfo.HealthCheckHandler;
import com.netflix.appinfo.InstanceInfo.InstanceStatus;

/**
 * 健康检查处理器
 * @author 杨恩雄
 *
 */
@Component
public class MyHealthCheckHandler implements HealthCheckHandler {

	@Autowired
	private MyHealthIndicator indicator;

	public InstanceStatus getStatus(InstanceStatus currentStatus) {
		Status s = indicator.health().getStatus();
		if(s.equals(Status.UP)) {
			System.out.println("数据库正常连接");
			return InstanceStatus.UP;
		} else {
			System.out.println("数据库无法连接");
			return InstanceStatus.DOWN;
		}
	}
}
