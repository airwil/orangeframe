package com.orangeframe.data;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Druid连接池配置参数
 * @author zhaowei
 *
 */
@ConfigurationProperties(prefix="spring.datasource.druid")
public class DruidProperites {
	//数据库驱动类，默认mysql
	private String driverClassName="com.mysql.jdbc.Driver";
	
	private String url;
	
	private String username;
	
	private String password;
	
	//初始化建立物理连接的个数，默认值为0
	private Integer initialSize;
	
	//最小连接池数量
	private Integer minIdle;
	
	//最大连接池数量，默认值为8
	private Integer maxActive;
	
	//获取连接最大等待时间，单位毫秒，配置了maxWait之后，缺省启用公平锁，并发效率会有所下降
	private Long maxWait;

	
	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getInitialSize() {
		return initialSize;
	}

	public void setInitialSize(Integer initialSize) {
		this.initialSize = initialSize;
	}

	public Integer getMinIdle() {
		return minIdle;
	}

	public void setMinIdle(Integer minIdle) {
		this.minIdle = minIdle;
	}

	public Integer getMaxActive() {
		return maxActive;
	}

	public void setMaxActive(Integer maxActive) {
		this.maxActive = maxActive;
	}

	public Long getMaxWait() {
		return maxWait;
	}

	public void setMaxWait(Long maxWait) {
		this.maxWait = maxWait;
	}
	
	
}
