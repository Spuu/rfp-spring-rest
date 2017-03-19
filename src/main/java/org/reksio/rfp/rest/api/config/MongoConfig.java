package org.reksio.rfp.rest.api.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

/**
 * MongoConfig
 */
@Configuration
public class MongoConfig extends AbstractMongoConfiguration
{
    @Override
    protected String getDatabaseName() {
        return "rfp";
    }

    @Override
    public Mongo mongo() throws Exception {
        return new MongoClient("localhost");
    }
}
