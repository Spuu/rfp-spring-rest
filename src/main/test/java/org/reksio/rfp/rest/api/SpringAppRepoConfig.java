package org.reksio.rfp.rest.api;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * SpringAppRepoConfig
 */
@Configuration
@EnableMongoRepositories
public class SpringAppRepoConfig extends AbstractMongoConfiguration {

    @Override
    protected String getDatabaseName() {
        return "test";
    }

    @Override
    public MongoClient mongo() throws Exception {
        return new MongoClient();
    }
}
