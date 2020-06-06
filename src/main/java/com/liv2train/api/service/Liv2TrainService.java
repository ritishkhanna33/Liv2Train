package com.liv2train.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liv2train.api.model.TrainingCenter;
import com.liv2train.api.repository.TrainingCenterRepository;

@Service
public class Liv2TrainService{

	@Autowired
	private TrainingCenterRepository trainingCenterRepository;
	
	public void saveCenter(TrainingCenter trainingCenter) {
		String epochTime= String.valueOf(System.currentTimeMillis());
		trainingCenter.setCreatedOn(epochTime);
		trainingCenterRepository.save(trainingCenter);
	}
	
	public List<TrainingCenter> getCenters() {
		List<TrainingCenter> trainingCenters = trainingCenterRepository.findAll();
		return trainingCenters;
	}

}
