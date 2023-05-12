package com.devsam.houses.Service;

import com.devsam.houses.Entity.House;

import java.util.List;

public interface HouseService {
   

    List<House> findall();

    House findById(Long houseId);

    House saveHouse(House house);
}
