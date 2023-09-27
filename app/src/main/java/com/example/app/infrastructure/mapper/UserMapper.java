package com.example.app.infrastructure.mapper;

import com.example.app.domain.model.User;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("SELECT * FROM users")
    List<User> findAll();

    @Select("SELECT * FROM users WHERE id = #{id}")
    User findById(@Param("id") String id);

    @Insert("INSERT INTO users (id, name, age) VALUES (#{id}, #{name}, #{age})")
    void save(User user);

    @Update("UPDATE users SET name = #{name}, age = #{age} WHERE id = #{id}")
    void update(User user);

    @Delete("DELETE FROM users WHERE id = #{id}")
    void deleteById(@Param("id") String id);
}
