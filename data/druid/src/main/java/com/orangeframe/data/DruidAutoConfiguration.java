package com.orangeframe.data;

import com.alibaba.druid.pool.DruidDataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


/**
 * AutoConfiguration for druid
 * druid数据库连接池自动化配置
 * @author zhaowei
 */
@Configuration
@EnableConfigurationProperties(DruidProperites.class)
public class DruidAutoConfiguration {
	private static final Logger logger=LoggerFactory.getLogger(DruidAutoConfiguration.class);
	
	@Autowired
	DruidProperites druidProperites;
	
	@Primary
	@Bean(name = "dataSource")
	@ConditionalOnMissingBean(name="dataSource")
	public DruidDataSource dataSource() {
		logger.info("Init DruidDataSource");
		DruidDataSource dataSource=new DruidDataSource();
		dataSource.setDriverClassName(druidProperites.getDriverClassName());
		dataSource.setUrl(druidProperites.getUrl());
		dataSource.setUsername(druidProperites.getUsername());
		dataSource.setPassword(druidProperites.getPassword());
		dataSource.setInitialSize(druidProperites.getInitialSize());
		dataSource.setMinIdle(druidProperites.getMinIdle());
		dataSource.setMaxActive(druidProperites.getMaxActive());
		dataSource.setMaxWait(druidProperites.getMaxWait());
		return dataSource;
	}
}
