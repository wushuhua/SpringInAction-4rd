package com.zh;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

/**
 * Created by zh on 2017-02-19.
 */
@Configuration
public class PersistenceTestConfig {

    @Bean(destroyMethod = "shutdown")
    @Profile("dev")
    public DataSource jndiDataSource() {
        return new EmbeddedDatabaseBuilder()
                .setType(EmbeddedDatabaseType.H2)
                .addScript("classpath:sql/schema.sql")
                .addScript("classpath:sql/test-data.sql")
                .build();
    }

    @Bean
    @Conditional(MagicExistsCondition.class)
    @Profile("dev")
    public MagicBean getMagicBean() {
        return new MagicBean();
    }
}
