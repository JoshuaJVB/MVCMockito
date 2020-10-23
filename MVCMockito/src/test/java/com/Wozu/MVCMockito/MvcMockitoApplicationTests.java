package com.Wozu.MVCMockito;

import com.Wozu.MVCMockito.controller.userController;
import com.Wozu.MVCMockito.model.User;
import com.Wozu.MVCMockito.repo.UserRepo;
import com.Wozu.MVCMockito.service.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;




@SpringBootTest
@ExtendWith(MockitoExtension.class)
class MvcMockitoApplicationTests {

	userController controller;

	@Autowired
	UserServiceImpl service;

	@MockBean
	UserRepo mockRepo;

	@BeforeEach
	void setUp(){
		controller = new userController(service);

	}


	@Test
	void testGet(){
		User expected = new User("xXsuperbadXx", new int[]{1, 2, 3}, 3, 16);
//		Optional<User> actual = Optional.of(expected);
		Mockito.when(mockRepo.findById(1L))
				.thenReturn(Optional.ofNullable(expected));


}

}
