package com.fitch.rest.bdService;

import com.fitch.rest.bdObject.Combinations;

public interface CombinationCalculateService {

	public Combinations getCombinationList(String phoneNumber);
	public Combinations getCombinationList(String phoneNumber, String pageNumber);
	
}
