package com.WebProject;

import org.springframework.boot.SpringApplication;
import com.WebProject.Enitiy.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.WebProject.dao.UserRepo;

@SpringBootApplication
public class BootjpajpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(BootjpajpaexampleApplication.class, args);
		UserRepo userrepo=context.getBean(UserRepo.class);
		User user=new User();
		user.setName("chetan");
		user.setStatus("programmer");
		User user1=userrepo.save(user);
		System.out.println(user);
		

}
}