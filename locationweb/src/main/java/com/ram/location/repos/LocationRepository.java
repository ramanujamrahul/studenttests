package com.ram.location.repos;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ram.location.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
