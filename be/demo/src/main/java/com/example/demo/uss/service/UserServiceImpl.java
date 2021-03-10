package com.example.demo.uss.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.example.demo.uss.repository.UserRepository;
import com.example.demo.uss.repository.UserRepositoryImpl;

@Service 
public class UserServiceImpl implements UserService{
	@Autowired UserRepositoryImpl repo;
	void test() {
		repo.test();
		System.out.print("abc");
		Math.random();
	}
}
