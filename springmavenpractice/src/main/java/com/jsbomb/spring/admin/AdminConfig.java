package com.jsbomb.spring.admin;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.ActiveProfiles;

@Configuration
@ComponentScan(basePackageClasses={AdminPropDev.class, AdminPropRel.class})
//@Import({AdminPropDev.class, AdminPropRel.class})
public class AdminConfig {

//	@Value("${admin.id}")
//	private String adminId;
//	
//	@Value("${admin.pw}")
//	private String adminPw;
//	
//	@Value("${ip}")
//	private String ip;
//	
//	@Value("${port}")
//	private String port;
//	
//	@Bean
//	public static PropertySourcesPlaceholderConfigurer devProperties() {
//		PropertySourcesPlaceholderConfigurer configurer =
//				new PropertySourcesPlaceholderConfigurer();
//		
//		configurer.setLocation(new ClassPathResource("META-INF/admin_dev.properties"));
//		
//		return configurer;
//	}
//	
//	@Bean
//	public static PropertySourcesPlaceholderConfigurer relProperties() {
//		PropertySourcesPlaceholderConfigurer configurer =
//				new PropertySourcesPlaceholderConfigurer();
//		
//		configurer.setLocation(new ClassPathResource("META-INF/admin_rel.properties"));
//		
//		
//		return configurer;
//	}
	
//	@Bean
//	public AdminProp adminProp() {
//		AdminProp prop = new AdminProp();
//		
//		prop.setAdminId(adminId);
//		prop.setAdminPw(adminPw);
//		prop.setIp(ip);
//		prop.setPort(port);
//		
//		return prop;
//	}
}
