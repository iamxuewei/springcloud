package com.example.springcloudprovide;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableCircuitBreaker
@EnableHystrixDashboard
@EnableHystrix
public class SpringcloudProvideApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudProvideApplication.class, args);
	}
//	@Bean
//	public ServletRegistrationBean getServlet(){
//
//		HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
//		ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
//		registrationBean.setLoadOnStartup(1);  //系统启动时加载顺序
//		registrationBean.addUrlMappings("/hystrix.stream");//路径
//		registrationBean.setName("HystrixMetricsStreamServlet");
//		return registrationBean;
//	}
}
