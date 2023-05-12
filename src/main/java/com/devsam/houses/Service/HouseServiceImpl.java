package com.devsam.houses.Service;

import com.devsam.houses.Entity.House;
import com.devsam.houses.Repository.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseServiceImpl implements HouseService {
    @Autowired
    private HouseRepository houseRepository;


    @Override
    public List<House> findall() {
        return houseRepository.findAll();
    }

    @Override
    public House findById(Long houseId) {
        return houseRepository.findById(houseId).get();
    }

    @Override
    public House saveHouse(House house) {
        return houseRepository.save(house);
    }

}
