package com.cg.healthcare.dao;


import com.cg.healthcare.entities.User;

public interface UserRepository {
		User findByUsername(String username);
}
