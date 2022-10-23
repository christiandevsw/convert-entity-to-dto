package com.dojo.springbootdtotutorial.repository;

import com.dojo.springbootdtotutorial.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location,Long > {
}
