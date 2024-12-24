package com.example.travel.mapper;

import com.example.travel.entity.User;
import org.apache.ibatis.annotations.*;

/**
 * 用户Mapper接口
 */
@Mapper
public interface UserMapper {
    
    @Select("SELECT * FROM users WHERE username = #{username}")
    User findByUsername(String username);
    
    @Select("SELECT * FROM users WHERE id = #{id}")
    User findById(Long id);
    
    @Update("UPDATE users SET token = #{token} WHERE id = #{id}")
    void updateToken(@Param("id") Long id, @Param("token") String token);

    @Insert("INSERT INTO users (username, password, email, phone, role) " +
            "VALUES (#{username}, #{password}, #{email}, #{phone}, #{role})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void register(User user);

    @Select("SELECT COUNT(*) FROM users WHERE username = #{username}")
    int checkUsernameExists(String username);

    @Select("SELECT COUNT(*) FROM users WHERE email = #{email}")
    int checkEmailExists(String email);
} 