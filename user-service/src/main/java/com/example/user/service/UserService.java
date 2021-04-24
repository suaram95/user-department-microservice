package com.example.user.service;

import com.example.user.VO.RestTemplateVO;
import com.example.user.entity.User;

public interface UserService {
    User saveUser(User user);

    RestTemplateVO getUserWithDepartment(int userId);
}
