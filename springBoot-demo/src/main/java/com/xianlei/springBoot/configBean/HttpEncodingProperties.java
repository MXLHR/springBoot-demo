package com.xianlei.springBoot.configBean;

import java.nio.charset.Charset;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("spring.http.encoding")
public class HttpEncodingProperties {
	
	/*
	 * 对应Web.xml编码
	 * 
	 * 	
	<!-- 字符集过滤器 -->  
	<filter>
		<filter-name>encodingFilter</filter-name>
		<filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
		<init-param>
			<param-name>encoding</param-name>
			<param-value>UTF-8</param-value>
		</init-param>
	</filter>
	<filter-mapping>
		<filter-name>encodingFilter</filter-name>
		<url-pattern>/*</url-pattern>
	</filter-mapping>
	 * 
	 */
	
	public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");
	
	private Charset charset = DEFAULT_CHARSET;
	
	private Boolean force = true;

	@Override
	public String toString() {
		return "HttpEncodingProperties [charset=" + charset + ", force=" + force + "]";
	}

	public Charset getCharset() {
		return charset;
	}

	public void setCharset(Charset charset) {
		this.charset = charset;
	}

	public Boolean getForce() {
		return force;
	}

	public void setForce(Boolean force) {
		this.force = force;
	}

	public static Charset getDefaultCharset() {
		return DEFAULT_CHARSET;
	}
	
	

}
