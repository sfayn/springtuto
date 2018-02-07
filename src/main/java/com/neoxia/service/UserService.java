package com.neoxia.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.neoxia.bean.User;

public interface UserService {
	Page<User> findByHotel(String name , Pageable pageable);

	User findByNameAndId(String name, int index);

	User save(User review);
}
