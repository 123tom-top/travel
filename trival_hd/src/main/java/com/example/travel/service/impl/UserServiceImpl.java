package com.example.travel.service.impl;

import com.example.travel.dto.LoginRequest;
import com.example.travel.dto.LoginResponse;
import com.example.travel.dto.RegisterRequest;
import com.example.travel.dto.RegisterResponse;
import com.example.travel.entity.User;
import com.example.travel.mapper.UserMapper;
import com.example.travel.service.UserService;
import com.example.travel.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户服务实现类
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    
    @Autowired
    private JwtUtil jwtUtil;

    @Override
    public LoginResponse login(LoginRequest loginRequest) {
        // 默认用户登录
        return login(loginRequest, "USER");
    }

    @Override
    public LoginResponse login(LoginRequest loginRequest, String role) {
        User user = userMapper.findByUsername(loginRequest.getUsername());
        
        if (user == null) {
            throw new IllegalArgumentException("用户不存在");
        }

        // 验证密码
        if (!user.getPassword().equals(loginRequest.getPassword())) {
            throw new IllegalArgumentException("密码错误");
        }

        // 验证角色
        if (!user.getRole().equalsIgnoreCase(role)) {
            throw new IllegalArgumentException("用户角色不匹配");
        }

        // 添加空值检查
        if (user.getUsername() == null || user.getRole() == null) {
            throw new IllegalStateException("用户数据不完整");
        }

        // 生成token
        String token = jwtUtil.generateToken(user);

        return new LoginResponse(true, token, "登录成功");
    }

    @Override
    public User getUserInfo(String token) {
        String username = jwtUtil.getUsernameFromToken(token);
        return userMapper.findByUsername(username);
    }

    @Override
    public void logout(String token) {
        // 可以在这里实现登出逻辑，比如将token加入黑名单等
        // 如果使用JWT，通常客户端直接删除token即可
    }

    @Override
    public RegisterResponse register(RegisterRequest request) {
        try {
            // 验证用户名是否已存在
            if (userMapper.checkUsernameExists(request.getUsername()) > 0) {
                throw new IllegalArgumentException("用户名已存���");
            }

            // 验证邮箱是否已存在
            if (userMapper.checkEmailExists(request.getEmail()) > 0) {
                throw new IllegalArgumentException("邮箱已被使用");
            }

            // 验证请求数据
            if (request.getUsername() == null || request.getUsername().trim().isEmpty()) {
                throw new IllegalArgumentException("用户名不能为空");
            }
            if (request.getPassword() == null || request.getPassword().trim().isEmpty()) {
                throw new IllegalArgumentException("密码不能为空");
            }
            if (request.getEmail() == null || request.getEmail().trim().isEmpty()) {
                throw new IllegalArgumentException("邮箱不能为空");
            }

            // 创建新用户
            User user = new User();
            user.setUsername(request.getUsername());
            user.setPassword(request.getPassword());
            user.setEmail(request.getEmail());
            user.setPhone(request.getPhone());
            user.setRole("user"); // 强制设置为普通用户角色

            // 保存用户
            userMapper.register(user);

            // 返回注册响应
            return RegisterResponse.builder()
                    .status("成功")
                    .message("用户注册成功")
                    .userId(String.valueOf(user.getId()))
                    .build();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
} 