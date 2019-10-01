package com.ram.location.service;

import java.util.List;

import com.ram.location.entities.Location;

public interface LocationServive {

Location saveLocation(Location location);
Location updateLocaiton(Location location);
void deleteLocation(Location location);
Location getLocationById(int id);
List<Location> getAllLocation();

}
