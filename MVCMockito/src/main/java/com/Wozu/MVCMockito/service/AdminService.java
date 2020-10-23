package com.Wozu.MVCMockito.service;

import com.Wozu.MVCMockito.model.Admin;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface AdminService {

    Optional<Admin> getAdminById(Long adminId);
    Optional<Admin> updateAdminPermissions(Admin newAdmin, Long adminId);
    void createAdmin(Admin admin);
    void deleteAdmin(Long adminId);
//    ArrayList<Post> getAllAdminPost(Long adminId, Post post);
//    ArrayList<Advertisement> getAllAdminAds(Long adminId, Advertisment ad);
}
