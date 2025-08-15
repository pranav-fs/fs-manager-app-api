package com.fastspring.app.config;

import com.brightmarket.engine.Settings;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.context.annotation.DependsOn;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;


import javax.naming.NamingException;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import java.util.Map;
import java.util.HashMap;

@EntityScan("com.brightmarket.core.*")
@Configuration
public class JpaPersistenceLibraryConfig {
    // properties wired from application.properties (migrated container setting) so no need of any environment vars
    @Value("${brightSettings.targetEnvironment}")
    private String targetEnvironment;
    @Value("${brightSettings.dynamoPrefix}")
    private String dynamoPrefix;
    @Value("${brightSettings.environment}")
    private String environment;
    @Value("${brightSettings.emailDestination}")
    private String emailDestination;
    @Value("${brightSettings.sitePathTestEnvPrefix}")
    private String sitePathTestEnvPrefix;


    @Bean
    public Settings brightSettings() throws NamingException {
        Map<String, Object> properties = new HashMap<>();
        properties.put("targetEnvironment", targetEnvironment);
        properties.put("dynamoPrefix", dynamoPrefix);
        properties.put("environment", environment);
        properties.put("emailDestination", emailDestination);
        properties.put("sitePathTestEnvPrefix", sitePathTestEnvPrefix);

        EnvironmentMapContext envContext = new EnvironmentMapContext(properties);
        return Settings.startUpLight(envContext);
    }

    @Bean
    @DependsOn("brightSettings")
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(){
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setPersistenceXmlLocation("classpath:META-INF/persistence.xml");
        em.setPersistenceUnitName("bright");
        return em;
    }

    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory emf){
        return new JpaTransactionManager(emf);
    }

    @Bean
    @DependsOn("entityManagerFactory")
    public EntityManager entityManager(LocalContainerEntityManagerFactoryBean factoryBean){
        return factoryBean.getObject().createEntityManager();
    }
}
