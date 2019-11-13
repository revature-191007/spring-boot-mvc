package com.revature.services;

import org.springframework.stereotype.Service;

import com.revature.models.Puppy;

@Service
public class PuppyService {

	public Puppy getPuppy() {
		return new Puppy(1, "Spot");
	}
	
}
