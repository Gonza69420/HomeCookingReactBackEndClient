package com.homecooking.demo.data.controller;


import com.homecooking.demo.data.entity.Admin;
import com.homecooking.demo.data.service.serviceimplementation.AdminServiceImpl;
import com.homecooking.demo.data.service.serviceinteface.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminRepository {
    @Autowired
    private AdminService adminService;

    @RequestMapping("/add")
    public String addAdmin(@RequestBody Admin admin){
        adminService.save(admin);
        return "Admin added";
    }

    @RequestMapping("/delete")
    public String deleteAdmin(@RequestBody Admin admin){
        adminService.delete(admin);
        return "Admin deleted";
    }
}
