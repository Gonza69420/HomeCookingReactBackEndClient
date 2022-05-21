package com.homecooking.demo.data.service.serviceimplementation;


import com.homecooking.demo.data.entity.Admin;
import com.homecooking.demo.data.repository.AdminRepository;
import com.homecooking.demo.data.service.serviceinteface.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private final AdminRepository adminRepository;

    public AdminServiceImpl(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }


    @Override
    public void save(Admin admin) {
        adminRepository.save(admin);
    }

    @Override
    public void delete(Admin admin) {
        adminRepository.delete(admin);
    }
}