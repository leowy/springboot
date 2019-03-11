package com.leo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 *
 * @author Leowy Zhuang
 */
@Configuration
//@EnableRedisRepositories
public class RedisConfig {

//	@Autowired
//	private RedisStandaloneConfiguration redis;
	
//	@Bean
//	RedisConnectionFactory redisConnectionFactory() {
//		 return new JedisConnectionFactory();
//		LettuceConnectionFactory factory = new LettuceConnectionFactory();
//		return factory;
//	}

	@Bean
	RedisTemplate<?, ?> redisTemplate(RedisConnectionFactory factory) {
		RedisTemplate<byte[], byte[]> template = new RedisTemplate<>();
		
		template.setConnectionFactory(factory);
		template.setKeySerializer(new StringRedisSerializer());
		template.setValueSerializer(new StringRedisSerializer());
		return template;
	}

}
