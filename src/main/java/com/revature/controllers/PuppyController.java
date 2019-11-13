package com.revature.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Puppy;
import com.revature.services.PuppyService;

@RestController
@RequestMapping("puppies")
public class PuppyController {
	PuppyService puppyService;
	
	@GetMapping("")
	public Puppy getPuppy() {
		return puppyService.getPuppy();
	}

	@Autowired
	public PuppyController(PuppyService puppyService) {
		super();
		this.puppyService = puppyService;
	}
	
}

