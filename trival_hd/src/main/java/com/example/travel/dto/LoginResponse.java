package com.example.travel.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginResponse {
    private boolean success;      // 登录是否成功
    private String token;         // JWT token或其他身份凭证
    private String message;       // 响应消息
} 