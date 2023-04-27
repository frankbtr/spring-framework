package com.frank.repository;

import com.frank.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegionRepository extends JpaRepository<Region, Long> {

    //Display all the regions in Canada
    List<Region> findByCountry(String country); //SELECT * region where country=canada


    //Display all regions in Canada, without duplicates
    List<Region> findDistinctByCountry(String country);


    //Display all Regions with country name includes "United"
    List<Region> findByCountryContaining(String country);

    //Display all regions with country name includes "United" in order;
    List<Region> findByCountryContainingOrderByCountry(String country);

    //Display top 2 regions in Canada
    List<Region> findTop2ByCountry(String country);
}
