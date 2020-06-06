package com.liv2train.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liv2train.api.model.TrainingCenter;
import com.liv2train.api.service.Liv2TrainService;

@RestController
@RequestMapping("liv2train")
@Validated
public class Liv2TrainController {
	
	@Autowired
	private Liv2TrainService service;
	
	@PostMapping("/save")
	public String saveTrainingCenter(@RequestBody @Valid TrainingCenter trainingCenter) {
		service.saveCenter(trainingCenter);
		return "Training Center Saved";
	}
	
	@GetMapping("/training_centers")
	public List<TrainingCenter> getTrainingCenters() {
		return service.getCenters();
		
	}
	
	

}
