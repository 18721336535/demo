package com.zbq.demo.mapper;

import com.zbq.demo.domain.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserMapper {
    public List<UserEntity> queryUserList();
}
