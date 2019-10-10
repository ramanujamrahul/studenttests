package com.ram.location.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ram.location.entities.Location;
import com.ram.location.service.LocationServive;

@Controller
public class LocationContoller {
	@Autowired
	LocationServive locationServive;

	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createLocation";
	}

	@RequestMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
		Location locationSaved = locationServive.saveLocation(location);
		String msg = "Location saved with id:" + locationSaved.getId();
		modelMap.addAttribute("msg", msg);
		return "createLocation";
	}

	@RequestMapping("/displayLocations")
	public String displayLocations(ModelMap modelMap) {
		List<Location> locations = locationServive.getAllLocation();
		modelMap.addAttribute("locations", locations);
		return "displayLocations";
	}

	@RequestMapping("deleteLocation")
	public String deleteLocations(@RequestParam("id") int id, ModelMap modelMap) {
		// Location location=locationServive.getLocationById(id);
		Location location = new Location();
		location.setId(id);
		locationServive.deleteLocation(location);
		List<Location> locations = locationServive.getAllLocation();
		modelMap.addAttribute("locations", locations);
		return "displayLocations";
	}

	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("id") int id, ModelMap modelMap) {
		Location location = locationServive.getLocationById(id);
		modelMap.addAttribute("location", location);
		return "updateLocation";
	}

	@RequestMapping("/updateLoc")
	public String updateLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
		{
			List<Location> locations = locationServive.getAllLocation();
			modelMap.addAttribute("locations", locations);
			return "displayLocations";
		}
	}
}
