package com.example.user.service;

import com.example.user.VO.Department;
import com.example.user.VO.RestTemplateVO;
import com.example.user.entity.User;
import com.example.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final RestTemplate restTemplate;

    @Override
    public User saveUser(User user) {
        log.info("Inside saveUser method of UserService");
        return userRepository.save(user);
    }

    @Override
    public RestTemplateVO getUserWithDepartment(int userId) {
        log.info("Inside getUserWithDepartment method of UserService");
        RestTemplateVO vo=new RestTemplateVO();
        User user=userRepository.findByUserId(userId);

        Department department = restTemplate.getForObject(
                "http://localhost:9001/departments/" + user.getUserId(),
                Department.class);
        vo.setUser(user);
        vo.setDepartment(department);
        return vo;
    }
}
