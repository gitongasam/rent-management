package com.devsam.houses.Controller;

import com.devsam.houses.Entity.House;
import com.devsam.houses.Service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/houses")
@RestController
public class HouseController {
    @Autowired
    private HouseService houseService;
    @PostMapping("/register/house")
    public House registerHouse(@RequestBody House house){
        return houseService.saveHouse(house);
    }

    @GetMapping("/find-all")
    public List<House> findAllHouse(){
        return houseService.findall();
    }

    public House findById(@PathVariable Long houseId){
        return houseService.findById(houseId);
    }
}
