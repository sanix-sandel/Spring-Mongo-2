/*package com.sanix.springmongo.config;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;
//configuration from scratch without extending AbstractMongoClientConfiguration
@Configuration
public class SimpleMongoConfig {

    @Bean
    public MongoClient mongo(){
        ConnectionString connectionString =new
                ConnectionString("mongodb://localhost:27017/test");
        MongoClientSettings mongoClientSettings=MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();
        return MongoClients.create(mongoClientSettings);
    }

    @Bean
    public MongoTemplate mongoTemplate() throws Exception{
        return new MongoTemplate(mongo(), "test");
    }
}
*/