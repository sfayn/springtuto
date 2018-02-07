package com.neoxia.controller;

import org.springframework.web.bind.annotation.RestController;

import com.neoxia.service.UserService;
import com.neoxia.util.CommonUtil;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
    private UserService userService;
    
	@RequestMapping(value = "/byname", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<Object> getUser(HttpServletRequest request) {
        Map<String, Object> map = CommonUtil.getParameterMap(request);
        String username = (String) map.get("name");
        Integer userId = (Integer) map.get("id");
        return new ResponseEntity<>(userService.findByNameAndId(username, userId), HttpStatus.OK);
    }
    
}