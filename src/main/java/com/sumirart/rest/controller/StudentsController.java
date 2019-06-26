package com.sumirart.rest.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sumirart.rest.model.StudentsModel;
import com.sumirart.rest.utils.CaseUtils;

@RestController
@RequestMapping("/students")
public class StudentsController {
	
	@Autowired
	CaseUtils caseUtils;
	
	private final AtomicLong counter = new AtomicLong();
	
	@GetMapping()
	public StudentsModel get(
			@RequestParam String name, @RequestParam Integer age, @RequestParam String address,
			@RequestParam String school) {
		StudentsModel students = new StudentsModel();
		students.setModel(counter.incrementAndGet(), 
				caseUtils.uppercase(name), 
				age, 
				caseUtils.uppercase(address), 
				caseUtils.uppercase(school));				
		return students;
	}
	
	@GetMapping("/{itemId}")
	public StudentsModel get(@PathVariable(name="itemId", required=true) Integer itemId) {
		StudentsModel students = new StudentsModel();
		students.setModel(itemId, "null", 0, "null", "null"
//				caseUtils.uppercase(name), 
//				age, 
//				caseUtils.uppercase(address), 
//				caseUtils.uppercase(school));
				);
				
		return students;
	}
	
	@GetMapping("/sample_utils")
	public String contohUtils(@RequestParam("input") String input) {
		return caseUtils.uppercase(input);
	}
}
