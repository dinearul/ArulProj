package com.mykarthik.testapp.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BeanConfigurations {

	@Bean
	@Primary
	@LoadBalanced
	@Qualifier("internal")
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Bean
	@Qualifier("external")
	public RestTemplate restTemplateExternal() {
		return new RestTemplate();
	}
}
