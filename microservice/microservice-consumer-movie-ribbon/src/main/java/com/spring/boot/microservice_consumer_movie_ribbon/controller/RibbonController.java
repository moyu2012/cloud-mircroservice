package com.spring.boot.microservice_consumer_movie_ribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.microservice_consumer_movie_ribbon.domain.User;
import com.spring.boot.microservice_consumer_movie_ribbon.service.RibbonService;

@RestController
public class RibbonController {
	@Autowired
	private RibbonService ribbonService;
	
	@GetMapping("/ribbon/{id}")
	public User findById(@PathVariable Long id) {
	    return this.ribbonService.findById(id);
	  }
}
