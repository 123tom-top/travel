package com.example.travel.service;

import com.example.travel.dto.LoginRequest;
import com.example.travel.dto.LoginResponse;
import com.example.travel.dto.RegisterRequest;
import com.example.travel.dto.RegisterResponse;
import com.example.travel.entity.User;

/**
 * 用户服务接口
 */
public interface UserService {
    /**
     * 用户登录
     * @param loginRequest 登录请求参数
     * @return 登录响应结果
     */
    LoginResponse login(LoginRequest loginRequest);

    /**
     * 带角色的登录
     * @param loginRequest 登录请求参数
     * @param role 角色
     * @return 登录响应结果
     */
    LoginResponse login(LoginRequest loginRequest, String role);

    RegisterResponse register(RegisterRequest request);

    User getUserInfo(String token);
    
    void logout(String token);
} 