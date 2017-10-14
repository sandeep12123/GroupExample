package com.sandeep.group.config;

import java.net.UnknownHostException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClient;

@Configuration
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class AppConfig {
	@Bean
	public MongoDbFactory mongoDbFactory() throws UnknownHostException{
		return new SimpleMongoDbFactory(new MongoClient("localhost", 27017), "demo2");
	}
	
	@Bean
	public MongoOperations mongoOperations() throws UnknownHostException{
		return new MongoTemplate(mongoDbFactory());
	}
}

