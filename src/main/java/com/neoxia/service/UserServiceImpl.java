package com.neoxia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.neoxia.bean.User;
import com.neoxia.dao.UserRepository;

@Component("userService")
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public Page<User> findByHotel(String name, Pageable pageable) {
		return userRepository.findByHotel(name, pageable);
	}

	@Override
	public User findByNameAndId(String name, int index) {
		return userRepository.findByNameAndId(name, index);
	}

	@Override
	public User save(User user) {
		return userRepository.save(user);
	}

}
