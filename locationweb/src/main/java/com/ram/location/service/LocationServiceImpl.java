package com.ram.location.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ram.location.entities.Location;
import com.ram.location.repos.LocationRepository;

@Service
public class LocationServiceImpl implements LocationServive {
	@Autowired
	private LocationRepository repository;

	@Override
	public Location saveLocation(Location location) {
		return repository.save((location));

	}

	@Override
	public Location updateLocaiton(Location location) {
		return repository.save((location));
	}

	@Override
	public void deleteLocation(Location location) {
		repository.delete(location);
	}

	@Override
	public Location getLocationById(int id) {
		return repository.findById(id).get();
	}

	@Override
	public List<Location> getAllLocation() {
		return repository.findAll();
	}

}
