package com.sumirart.rest.utils;

import org.springframework.stereotype.Controller;

@Controller
public class CaseUtils {
	
	public String uppercase(String input) {
		return input.toUpperCase();
	}
	
	public String lowercase(String input) {
		return input.toLowerCase();
	}
}
