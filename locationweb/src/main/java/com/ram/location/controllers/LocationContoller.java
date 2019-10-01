package com.ram.location.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LocationContoller {
	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createLocation";
	}
}
