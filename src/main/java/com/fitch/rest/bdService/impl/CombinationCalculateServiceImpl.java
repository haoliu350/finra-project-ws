package com.fitch.rest.bdService.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitch.rest.bdObject.Combinations;
import com.fitch.rest.bdService.CombinationCalculateService;
import com.fitch.rest.util.LetterCombinationsOfAPhoneNumber;

@Service
public class CombinationCalculateServiceImpl implements CombinationCalculateService {

	@Autowired
	LetterCombinationsOfAPhoneNumber l;
	
	@Override
	public Combinations getCombinationList(String phoneNumber) {
		
		Combinations c = new Combinations();
    	c.setInputNumber(phoneNumber);
    	c.setCombinationsNumber(l.letterCombinations(phoneNumber).size() + "");
    	c.setCombinations(l.letterCombinations(phoneNumber));
    	
		return c;
	}

	@Override
	public Combinations getCombinationList(String phoneNumber, String pageNumber) {
		// TODO Auto-generated method stub
		int page = Integer.parseInt(pageNumber);
		
		int startIndex = 0;
		int endIndex = l.letterCombinations(phoneNumber).size() - 1;
		
		
		if((20*page -1) > l.letterCombinations(phoneNumber).size() - 1)
			endIndex = l.letterCombinations(phoneNumber).size() - 1;
		
		Combinations c = new Combinations();
		List<String> subList = new ArrayList<String>();
		
		subList = l.letterCombinations(phoneNumber).subList( 20 * (page - 1 ), (20 * page) - 1);
		
    	c.setInputNumber(phoneNumber);
    	c.setCombinationsNumber(l.letterCombinations(phoneNumber).size() + "");
    	c.setCombinations(subList);
    	
    	
		return c;
	}

}
