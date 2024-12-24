package com.example.travel.entity;

import lombok.Data;

/**
 * 用户实体类
 */
@Data
public class User {
    private Long id;          // 用户ID
    private String username;  // 用户名
    private String password;  // 密码
    private String role;      // 角色(user/admin)
    private String email;     // 邮箱
    private String phone;     // 手机号码
    private String token;     // 登录token
} 