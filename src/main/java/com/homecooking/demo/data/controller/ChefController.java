package com.homecooking.demo.data.controller;


import com.homecooking.demo.data.entity.Chef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/chef")
public class ChefController {

    @Autowired
    private ChefService chefService;

    @PostMapping("/add")
    public String addChef(@RequestBody Chef chef){
        chefService.save(chef);
        return "Chef has been added";
    }

    @PostMapping("/delete")
    public String deleteChef(@RequestBody UUID id){
        chefService.delete(id);
        return "Chef has been deleted";
    }

    @PostMapping("/update")
    public String updateChef(@RequestBody Chef chef){
        chefService.update(chef);
        return "Chef has been updated";
    }

    @PostMapping("/getid")
    public Chef getChef(@RequestBody UUID id){
        if (chefService.getChefById(id).isPresent()){
            return chefService.getChefById(id).get();
        }
        return null;
    }

}
