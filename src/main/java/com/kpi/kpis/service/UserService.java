package com.kpi.kpis.service;

import com.kpi.kpis.domain.User;
import com.kpi.kpis.jpa.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void processUser(User user){
        userRepository.save(user);
    }
}
