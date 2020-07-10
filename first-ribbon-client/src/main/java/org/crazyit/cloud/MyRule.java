package org.crazyit.cloud;

import java.util.List;

import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.Server;

/**
 * 自定义的规则类
 *
 */
public class MyRule implements IRule {

    ILoadBalancer lb;

    public MyRule() {
    }

    public MyRule(ILoadBalancer lb) {
        this.lb = lb;
    }

    @Override
    public Server choose(Object key) {
        // 获取全部的服务器
        List<Server> servers = lb.getAllServers();
        // 只返回第一个Server对象
        return servers.get(0);
    }

    @Override
    public void setLoadBalancer(ILoadBalancer lb) {
        this.lb = lb;
    }

    @Override
    public ILoadBalancer getLoadBalancer() {
        return this.lb;
    }
}
