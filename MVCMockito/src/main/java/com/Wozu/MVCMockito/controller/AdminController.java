package com.Wozu.MVCMockito.controller;

import com.Wozu.MVCMockito.model.Admin;
import com.Wozu.MVCMockito.service.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AdminController {

    @Autowired
    AdminServiceImpl adminService;

    @GetMapping("/get/admin/{adminId}")
    public Optional<Admin> getAdminById(@PathVariable Long adminId){
        return adminService.getAdminById(adminId);
    }

    @PostMapping("/post/admin")
    public String createAdmin(@RequestBody Admin admin){
        adminService.createAdmin(admin);
        return "admin created";
    }

    @PutMapping("/put/admin/{adminId}")
    public Optional<Admin> updateAdminPermissions(@RequestBody Admin admin, @PathVariable Long adminId){
        return adminService.updateAdminPermissions(admin, adminId);
    }

    @DeleteMapping("/delete/admin/{adminId}")
    public String deleteAdmin(@PathVariable Long adminId){
        adminService.deleteAdmin(adminId);
        return "admin deleted";
    }
}
