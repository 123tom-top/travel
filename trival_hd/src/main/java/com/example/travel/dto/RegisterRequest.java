package com.example.travel.dto;

import lombok.Data;

/**
 * 注册请求DTO
 */
@Data
public class RegisterRequest {
    private String username;  // 用户名
    private String password;  // 密码
    private String email;     // 邮箱
    private String phone;     // 手机号码（可选）
    private String role;      // 角色
} 