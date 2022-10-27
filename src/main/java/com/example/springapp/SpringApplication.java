package com.example.springapp;

import com.example.springapp.bean.BeanProperties;
import com.example.springapp.bean.BeanWhitDependency;
import com.example.springapp.bean.MyBean;
import com.example.springapp.bean.entity.User;
import com.example.springapp.component.ComponentDependency;
import com.example.springapp.pojo.MyPojo;
import com.example.springapp.repository.UserRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SpringApplication implements CommandLineRunner {
	private ComponentDependency componentDependency;
	private final Log LOGGER = LogFactory.getLog(SpringApplication.class);
	private MyBean myBean;
	private BeanWhitDependency beanWhitDependency;


	private MyPojo myPojo;


	private BeanProperties beanProperties;
	private UserRepository userRepository;

	public SpringApplication(@Qualifier("componentImplement1") ComponentDependency componentDependency, MyBean myBean, BeanWhitDependency beanWhitDependency,MyPojo myPojo,  UserRepository userRepository) {
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.beanWhitDependency = beanWhitDependency;
	//	this.beanProperties = beanProperties;

		this.myPojo = myPojo;

		this.userRepository = userRepository;
	}

	public static void main(String[] args) {

		org.springframework.boot.SpringApplication.run(SpringApplication.class, args);
	}

	@Override
	public void run(String... args) {
		componentDependency.saludar();
		myBean.print();
		beanWhitDependency.saludara();
		//System.out.println(beanProperties.function());
		System.out.println(myPojo.getAge() );
		LOGGER.error("este es un error desde el log");
	//	saveUser();
	}
	public void saveUser(){
		User user1 = new User("jasson1","Steven1@gmail", LocalDate.of(1995,05,22));
		User user2 = new User("jasso2","Steven2@gmail", LocalDate.of(1994,05,22));
		User user3 = new User("jasson3","Steven3@gmail", LocalDate.of(1993,05,22));
		User user4 = new User("jasson4","Steven4@gmail", LocalDate.of(1992,05,22));
		User user5 = new User("jasson5","Steven5@gmail", LocalDate.of(1991,15,22));
		User user6 = new User("jasson6","Steven6@gmail", LocalDate.of(1990,25,22));
		List<User> list = Arrays.asList(user1, user2, user3, user4, user5, user6);
		list.stream().forEach(userRepository::save);
		//userRepository.saveAll(listUsers);
	}
}
