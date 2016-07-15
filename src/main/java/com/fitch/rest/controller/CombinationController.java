package com.fitch.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fitch.rest.bdObject.Combinations;
import com.fitch.rest.bdService.CombinationCalculateService;
import com.fitch.rest.util.LetterCombinationsOfAPhoneNumber;

@Controller
@RequestMapping("/api")
@CrossOrigin(origins = "http://52.26.150.86:8280", maxAge = 3600)
public class CombinationController {

 /*   private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();*/
	@Autowired
	LetterCombinationsOfAPhoneNumber l;
	@Autowired
	CombinationCalculateService ccs;

    @RequestMapping(path="/getCombinations" , method=RequestMethod.GET)
    public @ResponseBody Combinations getCombinations(@RequestParam(value="phoneNumber", required=false, defaultValue="9999999999") String phoneNumber) {
    	
    	/*Combinations c = new Combinations();
    	List<String> clist = new ArrayList<String>();
    	c.setCombinationsNumber("12345");
    	clist.add("9735731629");
    	clist.add("9735731628");
    	clist.add("9735731627");
    	clist.add(phoneNumber);
    	c.setCombinations(clist);*/
        return ccs.getCombinationList(phoneNumber);
    }
    
    @RequestMapping(path="/test" , method=RequestMethod.GET)
    public @ResponseBody Combinations test(@RequestParam(value="phoneNumber", required=false, defaultValue="9999999999") String phoneNumber, 
    									   @RequestParam(value="pageNumber", required=false, defaultValue="1") String pageNumber) {

    	/*Combinations c = new Combinations();
    	c.setInputNumber(phoneNumber);
    	c.setCombinationsNumber(l.letterCombinations(phoneNumber).size() + "");
    	c.setCombinations(l.letterCombinations(phoneNumber));*/
    	
    	return ccs.getCombinationList(phoneNumber, pageNumber);
    }

}
