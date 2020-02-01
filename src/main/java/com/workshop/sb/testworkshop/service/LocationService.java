package com.workshop.sb.testworkshop.service;

import com.workshop.sb.testworkshop.model.Location;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class LocationService {
    public List<Location> getBusLocation(){ // List ini ambil file Location di model
        List<Location> locationList = new ArrayList<>();

        Location locationBus1 = new Location();
        locationBus1.setLatitude(-6.2013972);
        locationBus1.setLongitudinal(106.7971189);
        locationBus1.setBus_driver_name("Joko");
        locationBus1.setDestination("Blok M");
        locationBus1.setEta(120);

        Location locationBus2 = new Location();
        locationBus2.setLatitude(-6.2013972);
        locationBus2.setLongitudinal(106.7971189);
        locationBus2.setBus_driver_name("Amir");
        locationBus2.setDestination("grogol");
        locationBus2.setEta(56);

        Location locationBus3 = new Location();
        locationBus3.setLatitude(-6.2013972);
        locationBus3.setLongitudinal(106.7971189);
        locationBus3.setBus_driver_name("Joko");
        locationBus3.setDestination("serpong");
        locationBus3.setEta(120);

        locationList.add(locationBus1);
        locationList.add(locationBus2);
        locationList.add(locationBus3);

        return locationList;
    }

}
