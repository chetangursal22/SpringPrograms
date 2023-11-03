package com.WebProject.dao;

import org.springframework.data.repository.CrudRepository;

import com.WebProject.Enitiy.User;

public interface UserRepo extends CrudRepository<User, Integer> {

}
