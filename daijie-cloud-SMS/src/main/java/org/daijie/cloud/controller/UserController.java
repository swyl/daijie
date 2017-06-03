package org.daijie.cloud.controller;

import org.daijie.cloud.service.UserService;
import org.daijie.core.controller.ApiController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController extends ApiController<UserService, Exception> {
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public Object getUser(){
		return service.getUser();
	}
}
