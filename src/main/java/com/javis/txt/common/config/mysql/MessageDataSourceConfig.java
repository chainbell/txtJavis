package com.javis.txt.common.config.mysql;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "messageEntityManagerFactory",
        transactionManagerRef = "messageTransactionManager",
        basePackages = { "com.javis.txt.dao.message.repository" }
)
public class MessageDataSourceConfig {

    @Bean(name = "messageDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.message")
    public DataSource getDataSource() {
        return DataSourceBuilder.create()
                .type(HikariDataSource.class)
                .build();
    }

    @Bean(name = "messageEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean getFactoryBean(EntityManagerFactoryBuilder builder) {
        return builder.dataSource(getDataSource()).packages("com.javis.txt.dao.message.entity").build();
    }

    @Bean(name = "messageTransactionManager")
    PlatformTransactionManager getTransactionManager(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(getFactoryBean(builder).getObject());
    }

}