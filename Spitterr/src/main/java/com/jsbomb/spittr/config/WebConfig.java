package com.jsbomb.spittr.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("spittr.web")
public class WebConfig extends WebMvcConfigurerAdapter {
	
//	@Bean
//	public ViewResolver viewResolver() {
//		InternalResourceViewResolver viewResolver =
//				new InternalResourceViewResolver();
//		
//		viewResolver.setPrefix("/WEB-INF/views/");
//		viewResolver.setSuffix(".jsp");
//		viewResolver.setExposeContextBeansAsAttributes(true);
//		return viewResolver;
//	}

	@Override
	public void configureDefaultServletHandling(
			DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
	
	//thymeleaf
//	@Bean
//	public ViewResolver viewResolver(TemplateEngine templateEngine) {
//		ThymeleafViewResolver viewResolver =
//				new ThymeleafViewResolver();
//		
//		viewResolver.setTemplateEngine(templateEngine);
//		return viewResolver;
//	}
//	
//	@Bean
//	public TemplateEngine templateEngine(ITemplateResolver templateResolver) {
//		SpringTemplateEngine templateEngine =
//				new SpringTemplateEngine();
//		
//		templateEngine.setTemplateResolver(templateResolver);
//		return templateEngine;
//	}
//	
//	@Bean
//	public ITemplateResolver templateResolver() {
//		SpringResourceTemplateResolver templateResolver =
//				new SpringResourceTemplateResolver();
//		
//		templateResolver.setPrefix("/WEB-INF/templates/");
//		templateResolver.setSuffix(".html");
//		templateResolver.setTemplateMode(TemplateMode.HTML);
//		return templateResolver;
//	}
	
	
	//tiles
	@Bean
	public ViewResolver viewResolver() {
		return new TilesViewResolver();
	}
	@Bean
	public TilesConfigurer tilesConfigurer() {
		TilesConfigurer tiles = new TilesConfigurer();
		tiles.setDefinitions(new String[] {
				"WEB-INF/layout/tiles.xml"
		});
		
		tiles.setCheckRefresh(true);
		
		return tiles;
	}
	
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		super.addResourceHandlers(registry);
	}
	  
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource =
				new ResourceBundleMessageSource();
		messageSource.setBasename("messages");
		return messageSource;
	}
}
