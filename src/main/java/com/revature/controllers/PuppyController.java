package com.revature.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("puppies")
public class PuppyController {
	@GetMapping("")
	public Puppy getPuppy() {
		return new Puppy(1, "Spot");
	}
}

class Puppy {
	private int id;
	private String name;
	public Puppy() {
		super();
	}
	public Puppy(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}