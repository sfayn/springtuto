package com.neoxia.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

import com.neoxia.bean.User;

public interface UserRepository extends Repository<User, Integer> {

	Page<User> findByHotel(String name , Pageable pageable);

	User findByNameAndId(String name, int index);

	User save(User review);

}
