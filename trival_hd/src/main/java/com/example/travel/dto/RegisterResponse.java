package com.example.travel.dto;

import lombok.Builder;
import lombok.Data;

/**
 * 注册响应DTO
 */
@Data
@Builder
public class RegisterResponse {
    private String status;    // 注册状态（成功/失败）
    private String message;   // 提示信息
    private String userId;    // 用户ID
} 