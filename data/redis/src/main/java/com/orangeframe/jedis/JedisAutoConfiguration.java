package com.orangeframe.jedis;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import redis.clients.jedis.Jedis;


/**
 * jedis自动化配置
 *
 */
@Configuration
@ConditionalOnBean(value=JedisConnectionFactory.class)
public class JedisAutoConfiguration {
	
	@Bean(name="jedis")
	public Jedis jedis(JedisConnectionFactory connectionFactory) {
		Jedis jedis = (Jedis) connectionFactory.getConnection().getNativeConnection();
		return jedis;
	}
}
