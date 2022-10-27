package com.example.springapp.configuration;

import com.example.springapp.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationBean {
    @Bean
    public MyBean beanOperation(){
        return new MyBeanImpl();
    }

    @Bean
    public MyOperation beanOperation2(){
        return new MyOperationImp();
    }
    @Bean
    public BeanWhitDependency beanWhitDependency(MyOperation myOperation){
        return new BeanWhitDependencyImp(myOperation);
    }
}
