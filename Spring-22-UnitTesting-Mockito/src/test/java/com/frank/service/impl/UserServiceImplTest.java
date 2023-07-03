package com.frank.service.impl;

import com.frank.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    @Mock
    UserRepository userRepository;

    @InjectMocks
    UserServiceImpl userService;

    @Test
    void deleteByUserName_test(){
        userService.deleteByUserName("mikesmith@cydeo.com");

        Mockito.verify(userRepository).deleteByUserName("mikesmith@cydeo.com");
        //Mockito.verify(userRepository,times(2)).deleteByUserName("mikesmith@cydeo.com");
//        Mockito.verify(userRepository,atLeastOnce()).deleteByUserName("mikesmith@cydeo.com");
//        Mockito.verify(userRepository,atLeast(5)).deleteByUserName("mikesmith@cydeo.com");
//        Mockito.verify(userRepository,atMostOnce()).deleteByUserName("mikesmith@cydeo.com");
//        Mockito.verify(userRepository,atMost(5)).deleteByUserName("mikesmith@cydeo.com");

        InOrder inOrder = inOrder(userRepository);

        inOrder.verify(userRepository).deleteByUserName("mikesmith@cydeo.com");
        inOrder.verify(userRepository).findAll();

    }
}