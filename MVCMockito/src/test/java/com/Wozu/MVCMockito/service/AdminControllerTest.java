package com.Wozu.MVCMockito.controller;

import com.Wozu.MVCMockito.model.Admin;
import com.Wozu.MVCMockito.service.AdminService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class AdminControllerTest {

    @Autowired
    AdminController adminController;
    Admin admin;

    @MockBean
    AdminService adminService;

    @BeforeEach
    void setUp(){
        adminController = new AdminController();
        admin = new Admin( 1l, "123456", true, true, true, true);
        Mockito.when(adminService.getAdminById(1l)).thenReturn(Optional.ofNullable(admin));
    }

    //Cannot get to run, Null pointer exception
    @Test
    void testGetAdminById(){
        Optional<Admin> expected = Optional.of(admin);
        Optional<Admin> actual = adminController.getAdminById(1l);
        assertEquals(actual, expected); 
    }
}