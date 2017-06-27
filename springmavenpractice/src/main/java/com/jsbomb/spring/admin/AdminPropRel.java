package com.jsbomb.spring.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
@Profile("rel")
@PropertySource("classpath:admin_rel.properties")
public class AdminPropRel {
	
	@Value("${admin.id}")
	private String adminId;
	
	@Value("${admin.pw}")
	private String adminPw;
	
	@Value("${ip}")
	private String ip;
	
	@Value("${port}")
	private String port;
	

	@Bean
	public static PropertySourcesPlaceholderConfigurer relProperties() {
		PropertySourcesPlaceholderConfigurer configurer =
				new PropertySourcesPlaceholderConfigurer();
		
		configurer.setLocation(new ClassPathResource("META-INF/admin_rel.properties"));
		
		
		return configurer;
	}
	
	@Autowired
	Environment env;
	
	@Bean
	public AdminProp adminProp() {
		AdminProp prop = new AdminProp();
		
		prop.setAdminId(adminId);
		prop.setAdminPw(adminPw);
		prop.setIp(ip);
		prop.setPort(port);
		
		
//		prop.setAdminId(env.getProperty("adminId"));
//		prop.setAdminPw(env.getProperty("adminPw"));
//		prop.setIp(env.getProperty("ip"));
//		prop.setPort(env.getProperty("port"));
		
		return prop;
	}

}
