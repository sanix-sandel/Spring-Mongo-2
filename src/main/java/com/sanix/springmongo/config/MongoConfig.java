package com.sanix.springmongo.config;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoClientConfiguration;

import java.util.Collection;
import java.util.Collections;

@Configuration
public class MongoConfig extends AbstractMongoClientConfiguration {
    //MongoTemplate is already defined in AbstractMongoClientConfiguration
    @Override
    protected String getDatabaseName(){
        return "test";
    }

    @Override
    public MongoClient mongoClient(){
        ConnectionString connectionString =new
                ConnectionString("mongodb://localhost:27017/test");
        MongoClientSettings mongoClientSettings=MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();

        return MongoClients.create(mongoClientSettings);
    }

    @Override
    public Collection getMappingBasePackages(){
        return Collections.singleton("com.sanix.springmongo");
    }
}
