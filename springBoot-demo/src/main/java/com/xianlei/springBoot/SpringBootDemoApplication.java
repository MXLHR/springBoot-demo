package com.xianlei.springBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xianlei.springBoot.model.AuthorSettings;

//@RestController
//@SpringBootApplication
public class SpringBootDemoApplication {
	
	@Autowired
	private AuthorSettings authorSetting;

	@Value("${book.author}")
	private String bookAuthor;

	@Value("${book.name}")
	private String bookName;

	@RequestMapping("/")
	String index() {
		String result = "【@Value属性装配，Spring4x提供】book name is " + bookName + "and book author is " + bookAuthor;
		return result;
	}
	
	@RequestMapping("/author")
	String author() {
		String result = "【Propertis类型安全装配】book name is " + authorSetting.getName() + "and author age is " + authorSetting.getAge();
		result +="/n/n优点：使用@Value在项目中会显得很麻烦，我们的配置通常是很过个，使用@Value会注入很多次";
		result +="/n/n SpringBoot 提供了基于类型安全的配置方式。 通过@ConfigurationProperties 注解将propertis的属性和Bean相关联。从而实现类型安全的配置";
		return result;
	}
	@RequestMapping("/log")
	String log(){
		String result = "推荐使用Logback";
		return result;
	}
	@RequestMapping("/profile")
	String profile(){
		String result = "通过在application.properties中设置spring.profile.active=prod来指定活动的Profile";
		result +="/n/n生产环境：application-prod.properties, 测试环境：application-dev.properties";
		return result;
	}
	@RequestMapping("/core")
	String core(){
		String result = "SpringBoot运行原理。";
		/*
		 * spring 4.x 提供了基于条件来配置Bean的能力，其实Spring Boot的神奇实现也是基于这一原理的。
		 * 
		 * 本节目标：
		 * 理解Spring Boot 运行自动配置的原理，并实现自己的自动配置。
		 *
		 * 1.spring Boot 自动配置的源码在 spring-boot-autoconfigure-1.5.x jar 内
		 * 2.application.properties 增加配置 debug=true
		 * 3.Debug 启动，增加JVM参数 -Ddebug. 
		 *  启动后会输出
		 *  Positive matches:已启用的自动配置
		 *  Negative matches:未启用的自动配置
		 * 
		 * 4.查看源码，理解运行原理
		 * spring-boot-autoconfigure-1.5.x jar 内有这个文件，
		 * /META-INF/spring.factories ， # Auto Configure 声明了有哪些自动配置
		 * 
		 * 打开任意一个自动配置，均有下面的条件注解。
		 * JmsAutoConfiguration
		 *  @Configuration
			@ConditionalOnClass({ Message.class, JmsTemplate.class })
			@ConditionalOnBean(ConnectionFactory.class)
			@EnableConfigurationProperties(JmsProperties.class)
			@Import(JmsAnnotationDrivenConfiguration.class)
		 *
		 * @ConditionalOnBean, 当容器里有指定的Bean的条件下
		 * @ConditionalOnClass: 当类路径下有指定的类的条件下
		 * @CondationalOnExpression:基于SpirngEl表达式作为判断条件
		 * @CondationalOnJava:基于JVM版本作为判断条件
		 * @CondationalOnJndi:在JNDI存在的条件下查找指定的位置。
		 * 
		 * @ConditionalOnWebApplication：当前项目是Web项目的条件下
		 *
		 */
		
		return result;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
}
