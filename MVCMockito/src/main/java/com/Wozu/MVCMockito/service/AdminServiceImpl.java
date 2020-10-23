package com.Wozu.MVCMockito.service;

import com.Wozu.MVCMockito.model.Admin;
import com.Wozu.MVCMockito.repo.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminRepo adminRepo;

    @Override
    public Optional<Admin> getAdminById(Long adminId) {
        return adminRepo.findById(adminId);
    }

    @Override
    public Optional<Admin> updateAdminPermissions(Admin newAdmin, Long adminId) {
        adminRepo.findById(adminId)
                .map(admin -> {
                    admin.setUserId(newAdmin.getUserId());
                    admin.setPassword(newAdmin.getPassword());
                    admin.setCanEditPosts(newAdmin.isCanEditPosts());
                    admin.setCanDeletePosts(newAdmin.isCanDeletePosts());
                    admin.setCanSuspendUsers(newAdmin.isCanSuspendUsers());
                    admin.setCanAdvertise(newAdmin.isCanAdvertise());
                    return adminRepo.save(admin);
                });
        return adminRepo.findById(adminId);
    }

    @Override
    public void createAdmin(Admin admin) {
        adminRepo.save(admin);
    }

    @Override
    public void deleteAdmin(Long adminId) {
        adminRepo.deleteById(adminId);
    }
}
