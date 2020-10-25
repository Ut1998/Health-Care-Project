package com.cg.healthcare.dao.copy;


import com.cg.healthcare.entities.User;

public interface UserRepository {
		User findByUsername(String username);
}
