package com.orangeframe.cache;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;

/**
 * redis-cache自动化配置
 * @author zhaowei
 *
 */
@Configuration
@EnableCaching
@ConditionalOnProperty(value = "spring.cache.enabled", havingValue = "true", matchIfMissing = false)
public class RedisCacheAutoConfigure {
	@Value("${spring.cache.prefixKey:orangeframe}")
	String prefixKey;

	@Bean("cacheManger")
	public CacheManager cacheManager(RedisCacheConfiguration cacheConfiguration,
			RedisConnectionFactory redisConnectionFactory) {
		cacheConfiguration.prefixKeysWith(prefixKey);// 设置前缀
		RedisCacheManager cacheManager = RedisCacheManager.RedisCacheManagerBuilder
				.fromConnectionFactory(redisConnectionFactory).cacheDefaults(cacheConfiguration).build();
		return cacheManager;
	}
}
