package com.example.springapp.configuration;

import com.example.springapp.bean.BeanProperties;
import com.example.springapp.bean.BeanPropertiesImp;
import com.example.springapp.bean.MyBean;
import com.example.springapp.bean.MyBeanImpl2;
import com.example.springapp.pojo.MyPojo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration
@EnableConfigurationProperties(MyPojo.class)
public class ConfigurationProperties {
    @Value("${value.name}")
    private String nombre;
    @Value("${value.apellido}")
    private String apellido;
    @Value("{$value.random}")
    private String random;

    @Bean
public MyBean myBean(){
return new MyBeanImpl2();
}
    @Bean
    public DataSource dataSource(){
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.h2.Driver");
        dataSourceBuilder.url("jdbc:h2:mem:test");
        dataSourceBuilder.username("SA");
        dataSourceBuilder.password("");
        return dataSourceBuilder.build();
    }
}
